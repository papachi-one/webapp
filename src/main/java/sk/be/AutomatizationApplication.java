package sk.be;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutomatizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomatizationApplication.class, args);
    }

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("test API")
                                .description("A CRUD API ")
                                .version("0.0.1-SNAPSHOT")
                                .license(
                                        new License().name("MIT").url("https://opensource.org/licenses/MIT")
                                )
                );
    }
}
