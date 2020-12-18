package gunsnhoney.springframework.di.sfgdi.controllers;

import gunsnhoney.springframework.di.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimaryGreetingService primaryGreetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello() {
        System.out.println("Hello World!!!");
        return primaryGreetingService.sayGreeting();
    }
}
