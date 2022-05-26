package com.fikri.contoh;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContohTest {

    private static  Logger log = LoggerFactory.getLogger(ContohTest.class);

    @Test
    void test() {

        log.info("halo");
        log.trace("halo trace");
    }
}
