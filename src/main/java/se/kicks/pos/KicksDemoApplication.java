package se.kicks.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
//@Controller
//@EnableAutoConfiguration
public class KicksDemoApplication {

//	@RequestMapping("/")
//	@ResponseBody
//	String home() {
//		return "Hello World 2!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(KicksDemoApplication.class, args);
	}
}
