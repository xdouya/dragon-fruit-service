package org.dy.system.dao;

import org.dy.system.domain.po.UserPo;

public interface UserPoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    UserPo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}