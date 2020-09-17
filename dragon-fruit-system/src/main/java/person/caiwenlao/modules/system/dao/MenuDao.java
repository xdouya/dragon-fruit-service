package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.MenuPo;
import person.caiwenlao.modules.system.domain.po.UserPo;

import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface MenuDao extends BaseDao<MenuPo, Long> {
    /**
     * 根据角色ID名查询
     * @param roleId 角色ID
     * @return /
     */
    List<MenuPo> findByRoleId(Long roleId);
}