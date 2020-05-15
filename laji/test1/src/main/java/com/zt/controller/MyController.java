package com.zt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger("my_logger");
    private static final Logger logger_w = LoggerFactory.getLogger("WARN_FILE");

    @GetMapping("/a")
    public String A() {
        logger.info("wzt...........................");
        logger.info("wzt1...........................");
        logger.info("wzt2...........................");
        logger.info("wzt3...........................");
        logger.info("wzt4...........................");
        logger.info("wzt5...........................");
        logger.info("wzt6...........................");
        logger_w.warn("警告。。。。。。。。。。。。。");
        return "hello";
    }
}
