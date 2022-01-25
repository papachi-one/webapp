package sk.be.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.be.util.AppErrorAttributes;

@Configuration
public class WebErrorConfiguration {


    @Bean
    public AppErrorAttributes errorAttributes() {
        return new AppErrorAttributes();
    }
}
