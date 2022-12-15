package cn.starlitpatrick.redline.userservice.mapper;

import cn.starlitpatrick.redline.userservice.pojo.dos.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户 Mapper
 *
 * @author tianyuheng
 */
@Mapper
public interface UserMapper {

    List<UserDO> selectList();

}
