package org.dy.system.dao;

import org.dy.system.domain.po.QuartzLogPo;

public interface QuartzLogPoMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(QuartzLogPo record);

    int insertSelective(QuartzLogPo record);

    QuartzLogPo selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(QuartzLogPo record);

    int updateByPrimaryKeyWithBLOBs(QuartzLogPo record);

    int updateByPrimaryKey(QuartzLogPo record);
}