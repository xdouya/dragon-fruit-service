package org.dy.system.dao;

import org.dy.system.domain.po.MenuPo;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
public interface MenuDao extends BaseDao<MenuPo, Long>{
    public List<MenuPo> selectByRoleId(Long roleId);
}