package com.example.day02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static java.lang.System.out;

@SpringBootApplication
public class Day02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(Day02Application.class, args);
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            out.println(bean);
        }
		out.println("Count=" + context.getBeanDefinitionCount());

        //mvnw spring-boot:run
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

}
