package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class SpringLearnApplication {
    private static void main(String[] args){
        LOGGER.info("START");
        displayDate();
        LOGGER.info("END");
    }
    public static void displayDate(){
        ApplicationContext context=new ClassPathXMLApplicationContext("date-format.xml");
        SimpleDateFormat format=context.getBean("dateFormat",SimpleDateFromat.class);
        try{
            Date date=format.parse("31/12/2003");
            System.out.println("Pasrsed Date: "+date);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
