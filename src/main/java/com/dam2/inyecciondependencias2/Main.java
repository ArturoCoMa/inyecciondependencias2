package com.dam2.inyecciondependencias2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-context.xml");

        Videojuego v = (Videojuego) beanFactory.getBean("videojuego");

        System.out.println("Titulo: "+v.getTitulo());
        System.out.println("Compañía: "+v.getCompania());
        System.out.println("Director: "+v.getDirector().getNombre()+" de nacionalidad "+v.getDirector().getNacionalidad());
        System.out.println("Genero: "+v.getGenero());
    }
}
