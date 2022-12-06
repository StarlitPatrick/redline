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

    private String username;

    private String password;

    private String nickname;

    private Date createTime;

    private Date updateTime;

}
