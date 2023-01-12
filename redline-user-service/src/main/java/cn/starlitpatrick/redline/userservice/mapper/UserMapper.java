package cn.starlitpatrick.redline.userservice.mapper;

import cn.starlitpatrick.redline.userservice.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 Mapper
 *
 * @author tianyuheng
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
