package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        First first = (First) context.getBean("first");
        Second second = (Second) context.getBean("second");
        System.out.println(first.sayHello("Islam"));
        System.out.println(second.sum(3, 4));
    }
}