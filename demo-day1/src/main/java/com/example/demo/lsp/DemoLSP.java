package com.example.demo.lsp;

interface Person {
    void f1();
//    void f2();
}

interface PersonV2 {
    void f2();
}

interface V2 extends Person, PersonV2 {

}

interface PersonCompose {
    void f1();
    void f2();
}

class PersonMySQL implements Person {
    public void f1() {
    }
}

class Base {
    void f1() {}
}

class Child extends Base {
    void f2() {}
}

class ChildCompose {
    void f1() {}
    void f2() {}
}

public class DemoLSP {
}
