package org.example;

import org.springframework.stereotype.Component;

@Component
public class First {

    public String sayHello(String name){
        return "Hello " + name;
    }
}
