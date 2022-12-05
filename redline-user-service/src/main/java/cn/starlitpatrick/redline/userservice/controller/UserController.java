package cn.starlitpatrick.redline.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author tianyuheng
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public String getTestInfo() {
        return "Hello, redline!";
    }

}
