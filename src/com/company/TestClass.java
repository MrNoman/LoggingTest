package com.company;

import java.util.logging.*;

public class TestClass {
    private Logger log = Logger.getLogger(SimpleLoggerTest.class.getPackage().getName());

    public void doSomeThing(){

        log.warning("TestClass WARNING");
        log.info("TestClass INFO");
    }
}
