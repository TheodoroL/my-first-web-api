package dio.theodoro.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - API Rest")
                        .version("1.0")
                        .description("Termos de uso: open source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença da sua empresa")
                                .url("https://github.com/TheodoroL"))
                        .contact(new Contact()
                                .name("TheodoroL")
                                .url("https://github.com/TheodoroL")
                                .email("testeemail@gmail.com"))
                );
    }
}
