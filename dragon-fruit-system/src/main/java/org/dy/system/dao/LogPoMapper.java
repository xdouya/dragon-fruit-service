package org.dy.system.dao;

import org.dy.system.domain.po.LogPo;

public interface LogPoMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(LogPo record);

    int insertSelective(LogPo record);

    LogPo selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(LogPo record);

    int updateByPrimaryKeyWithBLOBs(LogPo record);

    int updateByPrimaryKey(LogPo record);
}