package org.dy.system.dao;

import org.dy.system.domain.po.DictDetailPo;

public interface DictDetailPoMapper {
    int deleteByPrimaryKey(Long detailId);

    int insert(DictDetailPo record);

    int insertSelective(DictDetailPo record);

    DictDetailPo selectByPrimaryKey(Long detailId);

    int updateByPrimaryKeySelective(DictDetailPo record);

    int updateByPrimaryKey(DictDetailPo record);
}