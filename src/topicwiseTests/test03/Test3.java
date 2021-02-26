package topicwiseTests.test03;

class Paper {
    static String getType() { //Line n1
        return "GENERIC";
    }
}

class RuledPaper extends Paper {
//     BLAD KOMPILACJI!
//           }
}

public class Test3 {
    public static void main(String[] args) {
        Paper paper = new RuledPaper(); //Line n3
        System.out.println(paper.getType()); //Line n4
    }
}