package part2.section16;

import java.sql.*;

public class CallableExample {
    public static void main(String[] args) throws SQLException {

        // Wrap connection in a try-with-resources, so connection
        // automatically closed when completes or gets exception
        try (Connection connection =
                     ConnectionExamples.getConnection(
                             ConnectionExamples.derbyFileConnectionString);
        ) {
            // This method will create derby table PERSONS and populate
            // with data.
            setUpData(connection);

            // Retrieve and Print List of Person
            CRUDExamples.getPersonList(connection)
                    .forEach(System.out::println);

            // Execute java method which simply executes an update query
            javaUpdatePassThrough("BOB", 101);

            // Retrieve and Print List of Person
            CRUDExamples.getPersonList(connection)
                    .forEach(System.out::println);

        }
    }

    // Pass thru to other methods, to create a Table, PERSONS in the
    // Derby database, and add Data to it.
    public static void setUpData(Connection connection)
            throws SQLException {

        try {
            ConnectionExamples.dropTable(connection);
        } catch (SQLException se) {
            System.out.println(se);
        }

        // Example of DDL -
        ConnectionExamples.createTable(connection);

        // Example of DML - create data
        CRUDExamples.addData(connection);
    }

    // This is the java method which the Derby stored procedure will execute.
    public static void javaUpdatePassThrough(String name, int personId)
            throws SQLException {

        // Java code to do the actual update
        String query = "update person set name = ? where person_id = ?";

        try (Connection connection =
                     ConnectionExamples.getConnection(
                             ConnectionExamples.derbyFileConnectionString);
             PreparedStatement pstmt = connection.prepareStatement(query)
        ) {
            pstmt.setString(1, name);
            pstmt.setInt(2, personId);
            int result = pstmt.executeUpdate();
            if (result == 1) System.out.println("Row was updated");

        }
    }

    // Method creates a stored procedure in Derby based on java code
    public static void createProcForDerby(Connection connection)
            throws SQLException {

        // Derby let's you create a stored procedure based on java code,
        // in this case, the method CallableExample.testProc is defined in
        // current class.
        String createProcedure =
                "create procedure" +
                        " UPDATE_PERSON(" +
                        "IN name VARCHAR(255)," +
                        "IN pid INTEGER) " +
                        "PARAMETER STYLE JAVA READS SQL" +
                        " DATA LANGUAGE JAVA EXTERNAL NAME " +
                        "'CallableExample.javaUpdatePassThrough'";

        try (Statement stmt = connection.createStatement()) {
            try {
                // First drop Procedure
                stmt.execute("drop procedure UPDATE_PERSON");
            } catch (Exception e) {
                // Ignore error, might occur if procedure does not exist
            }
            // Create the stored procedure in Derby
            stmt.executeUpdate(createProcedure);

        }
    }

    // Executes the Derby stored procedure, keeps connection open
    public static void executeStoredProcedure(
            Connection connection, String name, int personId)
            throws SQLException {

        try (
                // CallableStatement similar to PreparedStatement except
                // calls a named stored procedure and passes it values
                CallableStatement cs =
                        connection.prepareCall("{ call UPDATE_PERSON(?, ?)}")) {
            cs.setString(1, name);
            cs.setInt(2, personId);
            cs.execute();
        }
    }

}
