package part1.section03.lvti;

public class LocalVariableTypeInterference {
    public static void main(String[] args) {
        // Lvti - zostalo wprowadzone w Javie 10
        var aClassWithAVeryVeryVeryLongNameeeeeeeeeee = new AClassWithAVeryVeryVeryLongNameeeeeeeeeee();
        aClassWithAVeryVeryVeryLongNameeeeeeeeeee.setName("Testing");
        System.out.println(aClassWithAVeryVeryVeryLongNameeeeeeeeeee);

        var i = 1;
        var aVarArray = new int[3];
        var methodVal = aClassWithAVeryVeryVeryLongNameeeeeeeeeee.getName();

        /*
        We can to assign a null object to LVTI but not literal null
         */
        Object nullObject = null;
        var var = nullObject;
//        var varNull = null;

        // Invalid var declarations:

//        // Cannot use var declaration in a compound statement
//        var j = 0, k = 0;
//
//        // Cannot declare a var variable without also initializing it
//        var someObject;
//
//        // Cannot assign null to var variable, type cannot be inferred!
//        var newvar = null;
//
//        // Cannot use array initializer in var declaration/initialization
//        var myArray = {"A", "B"};
//
//        // Cannot have an array of var
//        var[]newarray = new int[2];
    }
}
