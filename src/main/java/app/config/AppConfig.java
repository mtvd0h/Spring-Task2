package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "dog")
    public Dog getDog() {
        Dog dog = new Dog();
        dog.toString();
        return dog;
    }

    @Bean(name="timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }

}
