package org.dy.system.dao;

import org.dy.system.domain.po.DictPo;

public interface DictPoMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(DictPo record);

    int insertSelective(DictPo record);

    DictPo selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(DictPo record);

    int updateByPrimaryKey(DictPo record);
}