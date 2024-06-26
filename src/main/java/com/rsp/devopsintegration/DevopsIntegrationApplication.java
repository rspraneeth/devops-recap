package com.rsp.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

    @GetMapping
    public String message(){
        return "Just checking some jenkins and docker image stuff";
    }
}
