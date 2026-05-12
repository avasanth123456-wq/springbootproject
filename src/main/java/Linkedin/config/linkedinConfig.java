package Linkedin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class linkedinConfig {

    @Bean
    public String Job() {
        System.out.println("JOB");
        return "Hello Spring";
    }
}
