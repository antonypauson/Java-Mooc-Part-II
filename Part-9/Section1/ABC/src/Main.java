public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        //after inheritance
        //C -> B -> A
        c.a();
        c.b();
        c.c();
    }
}