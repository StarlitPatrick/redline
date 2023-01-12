package cn.starlitpatrick.redline.userservice.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.starlitpatrick.redline.userservice.entity.User;
import cn.starlitpatrick.redline.userservice.mapper.UserMapper;
import cn.starlitpatrick.redline.userservice.pojo.dto.UserDTO;
import cn.starlitpatrick.redline.userservice.pojo.vo.UserVO;
import cn.starlitpatrick.redline.userservice.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户业务层
 *
 * @author tianyuheng
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 新增用户
     *
     * @param userDTO 用户信息
     * @return 新增的用户 VO
     */
    @Override
    public UserVO addUser(UserDTO userDTO) {
        User user = new User(
                IdUtil.getSnowflakeNextId(),
                userDTO.getUsername(),
                userDTO.getPassword(),
                userDTO.getNickname()
        );
        this.save(user);
        return new UserVO(user);
    }

    /**
     * 获取所有用户信息
     *
     * @return 用户 VO 列表
     */
    @Override
    public List<UserVO> listUsers() {
        return this.list().stream().map(UserVO::new).collect(Collectors.toList());
    }

    /**
     * 更新用户信息
     *
     * @param id   用户 id
     * @param userDTO 用户信息
     * @return 更新后的用户信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserVO updateUser(Long id, UserDTO userDTO) {
        User user = this.getById(id);
        if (user == null) {
            // todo throw exception
            return null;
        }
        user.update(userDTO);
        this.updateById(user);
        return new UserVO(this.getById(user.getId()));
    }

}
