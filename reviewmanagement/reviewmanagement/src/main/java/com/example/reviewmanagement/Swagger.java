package com.example.reviewmanagement;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 public class Swagger {
 @Bean
 OpenAPI openAPI() {
     return new OpenAPI().info(new Info()
                 .title("Hello Swagger")
                 .version("3.0.1")
                 );
         }
 }

