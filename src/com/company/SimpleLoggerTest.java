package com.company;

import java.io.IOException;
import java.util.logging.*;


public class SimpleLoggerTest {
    private static Logger log = Logger.getLogger(SimpleLoggerTest.class.getPackage().getName());

    public static void main(String[] args) {

        try
        {
            LogManager.getLogManager().readConfiguration(SimpleLoggerTest.class.getResourceAsStream("/logger.properties"));
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        log.log(Level.INFO, "Main class INFO");
        log.log(Level.SEVERE, "Main class SEVERE");
        log.log(Level.FINE, "Main class FINE");

        new TestClass().doSomeThing();
        new ErrClass().doSomeThing();
    }
}
