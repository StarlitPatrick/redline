package cn.starlitpatrick.redline.userservice.controller;

import cn.starlitpatrick.redline.userservice.pojo.dtos.UserDTO;
import cn.starlitpatrick.redline.userservice.pojo.vos.UserVO;
import cn.starlitpatrick.redline.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 用户控制层
 *
 * @author tianyuheng
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserVO> addUser(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping
    public ResponseEntity<List<UserVO>> listUsers() {
        return ResponseEntity.ok(userService.listUsers());
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserVO> updateUser(@PathVariable("userId") @NotNull Long id,
                                             @RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") @NotNull Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(null);
    }
}
