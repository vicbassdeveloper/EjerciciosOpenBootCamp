package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    NotificationService notificationService;

    public NotificationService() {

    }

    public NotificationService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public static void imprimeSaludo() {
        System.out.println( "Saludo desde Notifiction Service");
    }
}
