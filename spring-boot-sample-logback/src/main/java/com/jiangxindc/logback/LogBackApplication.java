package com.jiangxindc.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class LogBackApplication {
    private static final Logger logger = LoggerFactory
            .getLogger(LogBackApplication.class);

    @PostConstruct
    public void log() {
        logger.trace("Sample Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warn Message");
        logger.error("Error Message");
    }

    public static void main(String[] args) {
        SpringApplication.run(LogBackApplication.class, args);
    }
}
