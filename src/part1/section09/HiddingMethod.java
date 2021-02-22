package part1.section09;

public class HiddingMethod {
    public static void main(String[] args) {
        AnimalAnimal.foo(); // prints Animal
        Cat.foo(); // prints Cat

        AnimalAnimal a = new AnimalAnimal();
        AnimalAnimal b = new Cat();
        Cat c = new Cat();
        AnimalAnimal d = null;

        a.foo(); // should not be done. Prints Animal because the declared type of a is Animal
        b.foo(); // should not be done. Prints Animal because the declared type of b is Animal
        c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
        d.foo(); // should not be done. Prints Animal because the declared type of d is Animal

        /*
        Calling static methods on instances rather than classes is a very bad practice,
        and should never be done.
        https://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explanation-is-confusing
         */
    }
}

class AnimalAnimal {
    public static void foo() {
        System.out.println("Animal");
    }
}

class Cat extends AnimalAnimal {
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
}