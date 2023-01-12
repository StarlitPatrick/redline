package cn.starlitpatrick.redline.userservice.service;

import cn.starlitpatrick.redline.userservice.pojo.dto.UserDTO;
import cn.starlitpatrick.redline.userservice.pojo.vo.UserVO;

import java.util.List;

/**
 * 用户 业务层接口
 *
 * @author tianyuheng
 */
public interface UserService {

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 新增的用户 VO
     */
    UserVO addUser(UserDTO user);

    /**
     * 获取所有用户信息
     *
     * @return 用户 VO 列表
     */
    List<UserVO> listUsers();

    /**
     * 更新用户信息
     *
     * @param id   用户 id
     * @param user 用户信息
     * @return 更新后的用户信息
     */
    UserVO updateUser(Long id, UserDTO user);

    /**
     * 删除用户
     *
     * @param id 用户 id
     */
    void deleteUser(Long id);
}
