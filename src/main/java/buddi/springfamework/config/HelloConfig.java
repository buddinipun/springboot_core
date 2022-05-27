package buddi.springfamework.config;

import buddi.springfamework.services.HelloWorldFactory;
import buddi.springfamework.services.HelloWorldService;
import buddi.springfamework.services.HelloWorldServiceEnglishImpl;
import buddi.springfamework.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
    @Bean
    public HelloWorldFactory helloWorldFactory() {return new HelloWorldFactory();}

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }
    @Bean
    @Qualifier("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("sp");
    }
    @Bean
    @Qualifier("german")
    public HelloWorldService HelloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ge");
    }
}
