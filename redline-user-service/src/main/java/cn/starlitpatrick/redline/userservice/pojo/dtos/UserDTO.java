package cn.starlitpatrick.redline.userservice.pojo.dtos;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户 DTO
 *
 * @author tianyuheng
 */
@Data
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -7954734945733424980L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;
}
