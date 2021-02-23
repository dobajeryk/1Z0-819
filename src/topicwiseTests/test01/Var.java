package topicwiseTests.test01;

public class Var {
    static String var = "FRIENDS"; //Line n1
    public static void main(String[] args) {
        int var = (var = Var.var.length()); //Line n2
        System.out.println(var); //Line n3
    }
}
