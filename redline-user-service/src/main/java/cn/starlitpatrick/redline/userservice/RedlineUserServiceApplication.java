package cn.starlitpatrick.redline.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.starlitpatrick.redline.userservice.mapper")
public class RedlineUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedlineUserServiceApplication.class, args);
    }

}
