package StudentApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public String Student(){
        System.out.println("Studing");
        return "studing";
    }
}
