package Semiconductor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SemiconductorConfig {
    @Bean
    public String Semiconductor(){
        System.out.println("Company");
        return "Semiconductor";
    }
}
