package buddi.springfamework.controllers;

import buddi.springfamework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("HelloWorldServiceGerman")
    public void setHellowWolrdServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldService = helloWorldServiceGerman;
    }
    @Autowired
    @Qualifier("spanish")
    public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldService = helloWorldServiceSpanish;
    }
    public String sayHello() {


        String greeting = helloWorldService.getGreeting();
        System.out.println( "testing"+ greeting);
        return greeting;


    }
}
