package com.company;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ErrClass {
    private Logger log = Logger.getLogger(ErrClass.class.getName());

    public void doSomeThing(){
        {
            try
            {
                LogManager.getLogManager().readConfiguration(ErrClass.class.getResourceAsStream("/logger.properties"));
            } catch (SecurityException | IOException e) {
                e.printStackTrace();
            }
        }

        log.warning("ErrClass WARNING");
        log.info("ErrClass INFO");
        log.config("ErrClass CONFIG");
        log.severe("ErrClass SEVERE");
    }
}
