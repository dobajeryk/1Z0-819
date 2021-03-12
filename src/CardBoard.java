public class CardBoard {

    Short story = 200;

    CardBoard myMethod(CardBoard cb) {
        System.out.println("C2 w metodzie na poczatku " + cb);
        cb = null;
        System.out.println("C2 w metodzie na koncu " + cb);
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.myMethod(c2);
        c1 = null;
        System.out.println("MAIN");
        System.out.println("C1 " + c1);
        System.out.println("C2 " + c2);
        System.out.println("C3 " + c3);
    }
}
