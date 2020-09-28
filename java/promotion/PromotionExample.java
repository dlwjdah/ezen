package promotion;

class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {

    public static void main(String[] args) {
        B b = new B(); //A, B
        C c = new C(); //A, C
        D d = new D(); //A, B, C
        E e = new E(); //A, C, E

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;
    }
}
