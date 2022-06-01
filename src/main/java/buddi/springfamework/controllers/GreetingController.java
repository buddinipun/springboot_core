package buddi.springfamework.controllers;

import buddi.springfamework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

//@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceSpanish;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceEnglish;


    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }



    public void setHellowWolrdServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }


    public void setHelloWorldServiceEnglish(HelloWorldService helloWorldServiceEnglish) {
        this.helloWorldServiceEnglish = helloWorldServiceEnglish;
    }


    public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldServiceSpanish = helloWorldServiceSpanish;
    }
    public String sayHello() {


        String greeting = helloWorldService.getGreeting();
        System.out.println( greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
      //  System.out.println(helloWorldServiceSpanish.getGreeting());
        return greeting;



    }
}
