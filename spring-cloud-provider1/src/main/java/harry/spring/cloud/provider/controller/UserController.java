package harry.spring.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Harry
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/sayHello")
	public String sayHello(){
		
		return "I'm provider1,hello consumer!";
	}
}
