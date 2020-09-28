package com.example.demo.report;

abstract class ReportType1 {
    abstract void buildHeader();
    abstract void buildBody();
    abstract void buildFooter();
    void build() {
        buildHeader();
        buildBody();
        buildFooter();
    }
}

class Report1 extends ReportType1 {
    void buildHeader() {}
    void buildBody() {}
    void buildFooter() {}
}

class Report2 extends ReportType1 {
    void buildHeader() {}
    void buildBody() {}
    void buildFooter() {}
}


public class DemoReport {

    public static void main(String[] args) {
        Report1 report1 = new Report1();
        report1.build();
    }
}
