package com.Blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BlogApplication {
    @Bean
    public ModelMapper modleMapper(){
        return new ModelMapper();
        //When ever we use external libreary this method step is mandatory
    }
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
        System.out.println("Successs");
    }
}

