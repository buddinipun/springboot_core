package buddi.springfamework.springboot;

import buddi.springfamework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("buddi.springfamework")
public class DependancyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =   SpringApplication.run(DependancyInjectionApplication.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }

}
