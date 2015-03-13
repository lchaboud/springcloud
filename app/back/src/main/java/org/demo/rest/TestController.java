package org.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Environment env;

    @RequestMapping("/test")
    public String index() {

        return env.getProperty("name");
    }

}