package com.coatardbul.sail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan(value = "com.coatardbul.sail.mapper")
@SpringBootApplication
public class SailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SailApplication.class, args);
    }

}
