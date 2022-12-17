package cn.starlitpatrick.redline.userservice.pojo.dos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户 DO
 *
 * @author tianyuheng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {

    private Long id;

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

    private Date createTime;

    private Date updateTime;

    public UserDO(Long id, String username, String password, String nickname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
