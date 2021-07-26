package com.example.FirstSpringProject;

//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/app") //delegate mapping
//@SpringBootApplication
public class ClassBasedController {
//    @Autowired
    private
    ArrayList<String> tasks=new ArrayList<>();

    // dbOBJECT db=new db();
    // db.saveObject(task);

    public ClassBasedController() {
        // pass a resource here through params instead of
        // direct DB queries
    }
    @GetMapping("/")
    public String tt(){return "Home method";}

    @RequestMapping("/addtask/{taskString}")
    public String getusedtothis(@PathVariable("taskString")String task){
        tasks.add(task);
        return "task has been added as the "+tasks.size()+"th task";
    }

    @RequestMapping("/gettasks")
    public String getUser() {
        StringBuilder s= new StringBuilder();
        for(String g:tasks)
            s.append(g).append("\n");
        return s.toString();
    }

    @RequestMapping("/remove_task/{id}")
    public String getUserCustomers(@PathVariable("id")int id) {
        tasks.remove(id);
        return "Task Removed";
    }

    @DeleteMapping("/bbbh")
    public String deleteUser() {
//        this.userRepository.deleteById(userId);
        //DB process
        //
        return "Delete";
    }
}


//package com.example.FirstSpringProject;
//
//import jdk.nashorn.internal.ir.RuntimeNode;
//import jdk.nashorn.internal.runtime.logging.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
////@SpringBootApplication // => Specifies Spring Main class
//@RestController  // => Specifies Handler class
//public class ClassBasedController {
//    @Autowired
//    static RestTemplate restTemplate;
//
////    public static void main(String[] args) {
////        SpringApplication.run(ClassBasedController.class, args);
////    }
//	@RequestMapping(value = "/")
//	public String hello(){
//		// simple method
//		return new String("Hello guys");
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
//	@Logger
//	@RequestMapping(value="/json")
//	public HashMap<String,String> jsonish(){
//		HashMap<String, String> map = new HashMap<>();
//		map.put("key", "value");
//		map.put("foo", "bar");
//		map.put("aa", "bb");
//		return map;
//	}
//	@GetMapping(value = "/sum/{num1}/{num2}")
//	public String sum(@PathVariable("num1")int num1,@PathVariable("num2")int num2){
//		return Integer.toString(num1 + num2);
//	}
////	@RequestMapping(value = "*", method = RequestMethod.GET)
////	public String getFallback() {
////		// generic method for all requests
////		return "Fallback for GET Requests";
////	}
//	// method for post, get and parameter get
//	// study about jackson , serialising and ResponseEntity concepts
//	// study key differences for Spring Vs Spring Boot
//	// @Autowired annotation
//	// Logging and BD connecting
//}

// learn about session in DB

