package harry.spring.cloud.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Harry
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerEurekaApplication.class, args);
		System.out.println("--服务监控访问地址" + "http://localhost:8761");
	}
}
