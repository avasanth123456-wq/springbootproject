package website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Courseconfig {
    @Bean

    public String NTR(){
        System.out.println("Devara");
        return "jai ntr";
    }
}
