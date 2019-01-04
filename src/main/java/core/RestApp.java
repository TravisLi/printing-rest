package core;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.User;

@SpringBootApplication
@CrossOrigin(maxAge = 4800, allowCredentials = "false") 
@RestController
@RequestMapping("/api")
public class RestApp {

	private static Logger logger = LoggerFactory.getLogger(RestApp.class);
	
	@RequestMapping(value="/resource",method = RequestMethod.GET)
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}

	@RequestMapping(value="/login/{username}/{pwd}",method = {RequestMethod.OPTIONS,RequestMethod.GET})
	public User login(@PathVariable("username")String username, @PathVariable("pwd")String pwd) {

		logger.info("login");

		if(username.equals("test")&&pwd.equals("1234")){
			return new User("1", "test", "test@gmail.com", "1234", "customer");
		}
		return null;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}
	
}
