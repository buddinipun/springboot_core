package buddi.springfamework.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;

        switch (language) {
            case "en" :
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "sp" :
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "ge" :
                service = new HelloWorldServiceGermanImpl();
                break;
            case "ru" :
                service = new HelloWorldServiceRussianImpl();
                break;
            default:
                new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
