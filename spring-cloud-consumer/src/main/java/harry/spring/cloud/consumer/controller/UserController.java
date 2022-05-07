package harry.spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Harry
 *
 */
@RestController
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		String url = "http://provider-user/user/sayHello";
		
		return restTemplate.getForObject(url, String.class);
	}
}
