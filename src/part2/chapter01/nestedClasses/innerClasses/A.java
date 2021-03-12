package part2.chapter01.nestedClasses.innerClasses;

public class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(A.this.x);
                System.out.println(B.this.x);
            }
        }

    }

    public static void main(String[] args) {
        A a = new A();
        // Mozemy na dwa sposoby zadeklarowac typ, poniewaz B jest memberem klasy A
        A.B b1 = a.new B();
        B b2 = a.new B();
        B.C c = b1.new C();
        c.allTheX();
        System.out.println();

         new A().new B().new C().allTheX();
    }
}
