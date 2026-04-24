package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
    }

    public void sayHello() {
        System.out.println("Hello from GitApplication!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Application is running";
    }

//    1차 개발 진행

}
