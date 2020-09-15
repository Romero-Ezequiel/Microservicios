package com.example.demo01;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {
    
    private final AtomicLong counter = new AtomicLong(); 
    private static final String template = "Holaaa";
    
    
    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Lalala") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
}
