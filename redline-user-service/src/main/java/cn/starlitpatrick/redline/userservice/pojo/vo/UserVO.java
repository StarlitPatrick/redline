package cn.starlitpatrick.redline.userservice.pojo.vo;

import cn.starlitpatrick.redline.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户 VO
 *
 * @author tianyuheng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 7829095819526371277L;

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    public UserVO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.nickname = user.getUsername();
    }

}
