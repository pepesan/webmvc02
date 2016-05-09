package com.pruebas.controllers;

import org.springframework.integration.syslog.SyslogHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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
    @RequestMapping(value="/hello")
    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException

    {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("variable","Valor");
        return new ModelAndView("hello","model",model);
    }

    @RequestMapping(value="/miruta/{id}")
    public ModelAndView manejadorRuta(@PathVariable Integer id){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id",id);
        return new ModelAndView("ruta","model",model);
    }
    @RequestMapping(value="/rutaparametro")
    public ModelAndView manejadorRutaParametro(@RequestParam("id")String id)
            throws ServletException, IOException
    {
        Map<String, Object> model = new HashMap<String, Object>();
        //String id=request.getParameter("id");
        System.out.println("id:"+id);
        model.put("id",id);
        return new ModelAndView("rutaparametro","model",model);
    }

}
