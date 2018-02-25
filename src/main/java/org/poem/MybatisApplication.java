package org.poem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.poem.mapper")
public class MybatisApplication {

    // can use this start this program
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }
}
