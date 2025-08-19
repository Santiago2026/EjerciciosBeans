package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {
    
    private static ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.xml");

    private AppContext() {
        // Constructor privado para evitar instanciación externa
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
    // es static para acceder sin instanciar la clase
}
