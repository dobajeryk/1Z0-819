package topicwiseTests.test03;

class Mm {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}

class Nn extends Mm {
//    public static void main(String[] args) { //Line n2
//        new Mm().main(args); //Line n3
//    }
}

public class Test4 {
    public static void main(String[] args) {
//        Nn.main(args); //Line n4
    }
}
