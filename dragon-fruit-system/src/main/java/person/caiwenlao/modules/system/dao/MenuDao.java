package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.model.Menu;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface MenuDao extends BaseDao<Menu, Long> {
    /**
     * 根据角色ID名查询
     * @param roleId 角色ID
     * @return /
     */
    List<Menu> findByRoleId(Long roleId);

    /**
     * 根据菜单标题查询
     * @param title 菜单标题
     * @return /
     */
    Menu findByTitle(String title);

    /**
     * 根据组件名称查询
     * @param name 组件名称
     * @return /
     */
    Menu findByComponentName(String name);

    /**
     * 根据菜单的 PID 查询
     * @param pid /
     * @return /
     */
    List<Menu> findByPid(long pid);

    /**
     * 查询顶级菜单
     * @return /
     */
    List<Menu> findByPidIsNull();

    /**
     * 根据角色ID与菜单类型查询菜单
     * @param roleIds roleIDs
     * @param type 类型
     * @return /
     */
    LinkedHashSet<Menu> findByRoleIdsAndTypeNot(Set<Long> roleIds, int type);

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