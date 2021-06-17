package com.dhamaka.slf4j;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class slf4j_controller {

    Logger logger= LoggerFactory.getLogger(slf4j_controller.class);


    @RequestMapping("/")
    public String home()
    {
        logger.error("Error message");
        logger.warn("Warning message");
        logger.info("Info message");
        logger.debug("Debug message");
        logger.trace("Trace message");
        //logger.trace("Home method access");
        return "hello hi";
    }
}
