package com.pruebas.controllers;


import org.springframework.http.HttpRequest;
import org.springframework.integration.syslog.SyslogHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;
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
    public ModelAndView manejadorRutaParametro(@RequestParam("id")String id, HttpServletRequest httpServletRequest)
            throws ServletException, IOException
    {
        Map<String, Object> model = new HashMap<String, Object>();
        //String id=request.getParameter("id");
        System.out.println("id:"+id);
        System.out.println("método:"+ httpServletRequest.getMethod());
        System.out.println("URI:"+httpServletRequest.getRequestURI());

        model.put("id",id);
        return new ModelAndView("rutaparametro","model",model);
    }
    @RequestMapping(value="/rutaredir")
    public ModelAndView manejadorRutaRedir(final RedirectAttributes redirectAttributes, HttpSession session)

    {
        session.setAttribute("var","foo");
        redirectAttributes.addFlashAttribute("id",2);
        return new ModelAndView("redirect:rutaredir2");
    }
    @RequestMapping(value="/rutaredir2")
    public ModelAndView manejadorRutaRedir2(@ModelAttribute("id") Integer id, HttpSession session)

    {
        Map<String, Object> model = new HashMap<String, Object>();
        //String id=request.getParameter("id");
        System.out.println("id:"+id);
        model.put("id",id);
        System.out.println("*** Session data ***");
        Enumeration<String> e = session.getAttributeNames();
        while (e.hasMoreElements()){
            String s = e.nextElement();
            System.out.println(s);
            System.out.println("**" + session.getAttribute(s));
            model.put(s,session.getAttribute(s));
        }
        return new ModelAndView("redir2","model",model);
    }

}
