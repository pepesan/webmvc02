package com.pruebas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pepesan on 8/5/16.
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello.htm")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response){
        return "hello";
    }

}
