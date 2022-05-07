package harry.spring.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author Harry
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
