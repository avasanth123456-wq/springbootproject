package home.application.config;



import home.application.entity.Home;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Home home() {
        System.out.println("MSD");
        return new Home();
    }
}