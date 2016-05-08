package com.pruebas.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pepesan on 7/5/16.
 */
public class EjemploFactoria {
    @Autowired
    private InjectarColecion cols;
    public EjemploFactoria(){
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] {"WEB-INF/applicationContext.xml"});
        BeanFactory factory = (BeanFactory) appContext;
        cols=(InjectarColecion) factory.getBean("cols");
    }
}
