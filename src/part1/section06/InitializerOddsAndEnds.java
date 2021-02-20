package part1.section06;

class ASuperClass {
    String name;

    // Constructor for Super Class
    ASuperClass() {
        System.out.println("Parent constructor executes"); // 1
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name; // 3 (Override) 6 (joe)
    }
}

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
    ASubClass() {
        System.out.println("Child no args constructor executes"); // 4
        setName(name);
    }

    // Constructor for Sub Class
    ASubClass(String name) {
        this();
        System.out.println("Child single argument constructor executes"); // 5
        setName(name);
    }

    // Initializer code
    {
        this.name = "Override";
        System.out.println("Child initializer executes"); // 2
        System.out.println(this);
    }

}

public class InitializerOddsAndEnds {
    public static void main(String[] args) {
        ASubClass joe = new ASubClass("Joe");
        System.out.println(joe);
    }
}
