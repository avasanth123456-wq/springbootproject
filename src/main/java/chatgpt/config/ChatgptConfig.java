package chatgpt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatgptConfig {
    @Bean
    public String Chatgpt(){
        System.out.println("Chatgpt");
        return "chatgpt";
    }
}
