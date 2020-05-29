package com.yst.manager.mapper;

import com.yst.manager.model.UserPO;

public interface UserPOMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}