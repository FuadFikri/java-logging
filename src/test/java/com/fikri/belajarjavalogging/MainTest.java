package com.fikri.belajarjavalogging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger logger = LoggerFactory.getLogger(MainTest.class);


    @Test
    void test() {

        logger.error("hello error");
        logger.warn("hello warn");
        logger.info("hello info");
        logger.debug("hello debug ");
        logger.trace("hello trace");
    }


    @Test
    void formatTest() {
        logger.info("string only");
        logger.info("{} + {} = {}", 10,20, (10+20));
        logger.error("ups ", new NullPointerException());
    }
}
