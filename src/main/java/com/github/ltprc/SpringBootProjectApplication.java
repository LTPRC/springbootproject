package com.github.ltprc;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.github.ltprc")
public class SpringBootProjectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootProjectApplication.class, args);
        
        SpringApplication app = new SpringApplication(SpringBootProjectApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
