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

    /**
     * 新增用户
     *
     * @param user 用户参数
     * @return 新增的用户信息
     */
    @PostMapping
    public ResponseEntity<UserVO> addUser(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    /**
     * 获取所有用户
     *
     * @return 所有用户信息的列表
     */
    @GetMapping
    public ResponseEntity<List<UserVO>> listUsers() {
        return ResponseEntity.ok(userService.listUsers());
    }

    /**
     * 修改用户信息
     *
     * @param id   被修改的用户的 ID
     * @param user 需要修改的用户信息
     * @return 修改后的用户信息
     */
    @PutMapping("/{userId}")
    public ResponseEntity<UserVO> updateUser(@PathVariable("userId") @NotNull Long id,
                                             @RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    /**
     * 删除用户
     *
     * @param id 被删除的用户 ID
     * @return 无
     */
    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") @NotNull Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(null);
    }
}
