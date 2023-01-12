package cn.starlitpatrick.redline.userservice.mapper;

import cn.starlitpatrick.redline.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户 Mapper
 *
 * @author tianyuheng
 */
@Mapper
public interface UserMapper {

    void insert(@Param("user") User user);

    User selectById(@Param("id") Long id);

    List<User> selectList();

    void updateById(@Param("user") User user);

    void deleteById(@Param("id") Long id);
}
