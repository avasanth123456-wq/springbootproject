package youtube.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Youtube {

    @Bean
    public Youtube youtube() {
        System.out.println("appName");
        return new Youtube( );
    }
}
