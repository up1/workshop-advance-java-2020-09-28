package com.example.demo.dip;

class A {
    void f1(B b) {
        b.f2();
    }
}
class B {
    void f2() {

    }
}
public class DemoDIP {
    public static void main(String[] args) {
        B b = new B();
//        A a = new A(b); // Constructor injection
//        a.setB(b); // Property/Setter injection
//        a.f1(b); // Method injection
    }
}
