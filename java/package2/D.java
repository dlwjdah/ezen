package package2;

import package1.A;

public class D extends A {
    public D() {
        super();
        this.field1 = "10";
        this.field2 = "20";
        this.field3 = "30";
        this.field4 = "40";

    }

    public void method() {
        A a = new A();
        a.field1 = "10";
        a.field1 = "10";
        a.field1 = "10";
        a.field1 = "10";

    }
    public void methodD1(){

    }
}
