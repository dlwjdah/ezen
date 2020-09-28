package package1;

public class B {
    public void method() {
        A a = new A();
        //a.field = "value";
        a.field2(20);
        a.field3(30);
        a.field4(40);
    }
}

class B1 extends A {
    int methodB1() {
        a.field1(10);
        a.field2(20);
        a.field3(30);
        a.field4(40);

    }
}
