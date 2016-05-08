package com.pruebas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pepesan on 8/5/16.
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello.htm")
    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException

    {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("variable","Valor");
        return new ModelAndView("hello","model",model);
    }

}
