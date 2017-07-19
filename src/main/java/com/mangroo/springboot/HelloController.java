package com.mangroo.springboot;

import com.mangroo.springboot.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(path="/customers", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Customer postCustomer(@RequestBody Customer customer){
        System.out.println("Customer ID :" + customer.toString());
        return customer;
    }
}