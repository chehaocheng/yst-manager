package com.yst.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @SpringBootApplication：标注一个主程序类，用来标明这是一个Spring Boot应用
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringBootApplicationService {

    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationService.class, args);
    }

}
