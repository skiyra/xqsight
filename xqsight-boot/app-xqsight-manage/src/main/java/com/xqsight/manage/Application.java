package com.xqsight.manage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by GTaurus on 2016/5/4.
 */
@ImportResource("classpath:applicationContext.xml")
@SpringBootApplication(scanBasePackages = {"com.xqsight"})
public class Application {

    private static final Logger logger = LogManager.getLogger();

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("The program can be stoped using <ctrl>+<c>");
    }
}
