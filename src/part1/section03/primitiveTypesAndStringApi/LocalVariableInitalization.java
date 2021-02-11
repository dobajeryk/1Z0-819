package part1.section03.primitiveTypesAndStringApi;

public class LocalVariableInitalization {
    public static void main(String[] args) {
        /*
        Partial initalization zmiennej lokalnej spowoduje blad!
         */

        // Pelna inicjalizacja
        int p;
        if (true) {
            p = 1;
        } else {
            p = 2;
        }

        // Niepelna inicjalizacja
        int r;
        boolean myBoolean = false;
        if (myBoolean) {
            r = 1;
        }

        // Zeby uzyskac pelna inicjalizacje w bloku switch, trzeba uzyc bloku defualt!

        // while statement  satisfies compiler's full initialization
        // check only if condition is staticly known!!!!!!!!!!!!!!!!!!
        int u, v = 0;  // u is an uninitialized local variable here
        while (true) {
            u = v++;
            break;
        }
        System.out.println("u is " + u); // u is now fully initialized
    }
}
