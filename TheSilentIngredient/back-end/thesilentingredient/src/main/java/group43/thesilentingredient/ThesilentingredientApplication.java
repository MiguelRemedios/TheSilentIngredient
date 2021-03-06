package group43.thesilentingredient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ThesilentingredientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThesilentingredientApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/recipe").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe/*").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-image").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-image/**").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/diet").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-ingredient").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-ingredient/**").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/ingredient").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-step").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/api/v1/recipe-step/**").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT");
			}
		};

	}
}
