package org.dy.system.dao;

import org.dy.core.dao.BaseDao;
import org.dy.system.domain.po.DeptPo;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
public interface DeptDao extends BaseDao<DeptPo, Long> {
    public List<DeptPo> selectByRoleId(Long userId);
}