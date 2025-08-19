package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class AppContext {
    
    private static ApplicationContext applicationContext= new AnnotationConfigApplicationContext("org.example");

    private AppContext() {
        // Constructor privado para evitar instanciación externa
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
    // es static para acceder sin instanciar la clase
}
