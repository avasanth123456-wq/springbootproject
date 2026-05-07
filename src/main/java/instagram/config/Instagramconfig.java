package instagram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instagramconfig {
    @Bean
    public String testBean() {
        System.out.println("testBean");
        return "Hello Spring";
    }
}
