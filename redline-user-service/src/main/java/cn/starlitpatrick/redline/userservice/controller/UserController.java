package cn.starlitpatrick.redline.userservice.controller;

import cn.starlitpatrick.redline.userservice.pojo.dtos.UserDTO;
import cn.starlitpatrick.redline.userservice.pojo.vos.UserVO;
import cn.starlitpatrick.redline.userservice.service.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制层
 *
 * @author tianyuheng
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping()
    public ResponseEntity<UserVO> addUser(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping("/list")
    public ResponseEntity<List<UserVO>> listUsers() {
        return ResponseEntity.ok(userService.listUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserVO> updateUser(@PathVariable("id") @NotNull Long id, @RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") @NotNull Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(null);
    }
}
