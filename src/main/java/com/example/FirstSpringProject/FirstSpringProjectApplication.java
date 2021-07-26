package com.example.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@SpringBootApplication
@ComponentScan
// => Specifies Spring Main class
//@RestController  // => Specifies Handler class// conroller => controls url routings
public class FirstSpringProjectApplication {
	@Autowired
	static RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}
//	@RequestMapping(value = "/")
//	public String hello(){
//		// simple method
//		return "Hello guys";
//	}
////	@RequestMapping => any method type
////	@GetMapping , @PostMapping => can also be use as replacement for method=GET or POST
//	@RequestMapping(value="/f1",method = RequestMethod.GET)
//	public String hes(){
//		return "Get Method";
//	}
//	@RequestMapping(value ="/f2/{id}")
//	@ResponseBody
//	public String f2(@PathVariable("id")int id){
//		return "Path variable is "+id;
//	}
//
//	@RequestMapping(value="/json")
//	public HashMap<String,String> jsonish(){
//		HashMap<String, String> map = new HashMap<>();
//		map.put("key", "value");
//		map.put("foo", "bar");
//		map.put("aa", "bb");
//		return map;
//	}
//
//	@GetMapping(value = "/sum/{num1}/{num2}")
//	public String sum(@PathVariable("num1")int num1,@PathVariable("num2")int num2){
//		return Integer.toString(num1 + num2);
//	}
//	@RequestMapping(value ="/f4/{name}")
//	public String f2(@PathVariable("name")String name){
//		return "Path variable is "+name;
//	}
//
//	@RequestMapping(value = "*", method = RequestMethod.GET)
//	public String getFallback() {
//		// generic method for all requests
//		return "Fallback for GET Requests";
//	}
////	// method for post, get and parameter get
////	// study about jackson , serialising and ResponseEntity concepts
////	// study key differences for Spring Vs Spring Boot
////	// @Autowired annotation
////	// Logging and BD connecting
}
