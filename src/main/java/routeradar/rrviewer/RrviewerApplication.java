package routeradar.rrviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class RrviewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RrviewerApplication.class, args);
	}
	@Configuration
	public class CorsConfiguration {
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/api/**")
							.allowedOrigins("http://localhost:3000")
							.allowedMethods("GET", "POST", "PUT", "DELETE")
							.allowedHeaders("*");
				}
			};
		}
	}

}
