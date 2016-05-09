package com.pruebas.controllers;

import com.pruebas.beans.Student;
import org.springframework.batch.core.step.tasklet.SystemCommandException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pepesan on 8/5/16.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute("student")Student student) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("variable","Valor");
        model.put("name", student.getName());
        model.put("age", student.getAge());
        model.put("id", student.getId());
        return new ModelAndView("result","model",model);
    }
}