package cn.starlitpatrick.redline.userservice.mapper;

import cn.starlitpatrick.redline.userservice.pojo.dos.UserDO;
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

    void insert(@Param("user") UserDO userDO);

    UserDO selectById(@Param("id") Long id);

    List<UserDO> selectList();

}
