package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
public interface UserMapper {
    User findUserByUserId(@Param("userId") String userId);
}
