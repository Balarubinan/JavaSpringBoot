package com.example.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import sun.net.www.content.text.Generic;

import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Scanner;

class Sample{
    @Autowired
    static RestTemplate restTemplate;
    public static void main(String[] args){
        while(true){
            try{
            System.out.print("Press to start...");
            String a=new Scanner(System.in).next();
            HashMap responseEntity=restTemplate.getForObject("http://localhost:8080/json/",HashMap.class);
            System.out.println(responseEntity);}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .build();
    }
}