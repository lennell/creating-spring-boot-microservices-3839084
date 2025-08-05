package com.example;

import com.example.tourservice.TourManagementService;
import com.example.tourservice.TravelAgentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.tourservice")
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        TravelAgentService agent = context.getBean(TravelAgentService.class);
        TourManagementService service = context.getBean(TourManagementService.class);
        service.createTour("Zoo Tour", 100, true);
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}
