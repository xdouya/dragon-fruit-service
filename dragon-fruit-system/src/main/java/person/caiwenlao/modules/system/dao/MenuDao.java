package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.MenuPo;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

    /**
     * 根据菜单标题查询
     * @param title 菜单标题
     * @return /
     */
    MenuPo findByTitle(String title);

    /**
     * 根据组件名称查询
     * @param name 组件名称
     * @return /
     */
    MenuPo findByComponentName(String name);

    /**
     * 根据菜单的 PID 查询
     * @param pid /
     * @return /
     */
    List<MenuPo> findByPid(long pid);

    /**
     * 查询顶级菜单
     * @return /
     */
    List<MenuPo> findByPidIsNull();

    /**
     * 根据角色ID与菜单类型查询菜单
     * @param roleIds roleIDs
     * @param type 类型
     * @return /
     */
    LinkedHashSet<MenuPo> findByRoleIdsAndTypeNot(Set<Long> roleIds, int type);

    /**
     * 获取节点数量
     * @param id /
     * @return /
     */
    int countByPid(Long id);

    /**
     * 更新节点数目
     * @param count /
     * @param menuId /
     */
    void updateSubCntById(int count, Long menuId);
}