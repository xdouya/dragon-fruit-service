package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.RolePo;

import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface RoleDao extends BaseDao<RolePo, Long> {
    /**
     * 根据用户名查询
     * @param userId 用户id
     * @return /
     */
    List<RolePo> findByUserId(Long userId);

    /**
     * 根据名称查询
     * @param name /
     * @return /
     */
    RolePo findByName(String name);

    /**
     * 删除多个角色
     * @param roleIds /
     */
    void deleteAllByIdIn(Set<Long> roleIds);

    /**
     * 解绑角色菜单
     * @param menuId 菜单ID
     */
    void untiedMenu(Long menuId);

    /**
     * 根据部门查询
     * @param deptIds /
     * @return /
     */
    int countByDepts(Set<Long> deptIds);

    /**
     * 根据菜单Id查询
     * @param menuIds /
     * @return /
     */
    List<RolePo> findInMenuId(List<Long> menuIds);
}