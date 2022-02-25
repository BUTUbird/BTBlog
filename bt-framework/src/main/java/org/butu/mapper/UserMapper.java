package org.butu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.butu.domain.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
