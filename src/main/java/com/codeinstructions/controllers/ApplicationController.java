package com.codeinstructions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Domingos on 20/11/2014.
 */
@Controller()
public class ApplicationController {

    @RequestMapping("/")
    @ResponseBody
    public String root() {
        return "Hello, World";
    }

    @RequestMapping("/api/trades")
    @ResponseBody
    public String getTrades() {
        return "{'asset':'petr4','price':10.0}";
    }
}
