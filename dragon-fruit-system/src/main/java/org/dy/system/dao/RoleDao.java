package org.dy.system.dao;

import org.dy.core.dao.BaseDao;
import org.dy.system.domain.po.RolePo;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
public interface RoleDao extends BaseDao<RolePo, Long> {
    public List<RolePo> selectByUserId(Long userId);
}