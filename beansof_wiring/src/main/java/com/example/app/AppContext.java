package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.example.config.AppConfig;

public class AppContext {
    
    private static ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);

    private AppContext() {
        // Constructor privado para evitar instanciación externa
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
    // es static para acceder sin instanciar la clase
}
