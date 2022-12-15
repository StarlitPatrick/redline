package cn.starlitpatrick.redline.userservice.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.starlitpatrick.redline.userservice.mapper.UserMapper;
import cn.starlitpatrick.redline.userservice.pojo.dtos.UserDTO;
import cn.starlitpatrick.redline.userservice.pojo.vos.UserVO;
import cn.starlitpatrick.redline.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务层
 *
 * @author tianyuheng
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 新增的用户 VO
     */
    @Override
    @Transactional
    public UserVO addUser(UserDTO user) {
        return null;
    }

    /**
     * 获取所有用户信息
     *
     * @return 用户 VO 列表
     */
    @Override
    public List<UserVO> listUsers() {
        return BeanUtil.copyToList(userMapper.selectList(), UserVO.class);
    }

    /**
     * 更新用户信息
     *
     * @param id   用户 id
     * @param user 用户信息
     * @return 更新后的用户信息
     */
    @Override
    public UserVO updateUser(Long id, UserDTO user) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param id 用户 id
     */
    @Override
    public void deleteUser(Long id) {

    }

}
