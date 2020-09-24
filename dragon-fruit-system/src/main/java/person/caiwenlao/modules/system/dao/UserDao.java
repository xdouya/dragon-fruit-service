package person.caiwenlao.modules.system.dao;


import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.model.User;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface UserDao extends BaseDao<User, Long> {
    /**
     * 根据用户名查询
     * @param username 用户名
     * @return /
     */
    User findByUsername(String username);

    /**
     * 根据邮箱查询
     * @param email 邮箱
     * @return /
     */
    User findByEmail(String email);

    /**
     * 修改密码
     * @param username 用户名
     * @param password 密码
     * @param pwdResetTime 密码重置时间
     */
    void updatePass(String username, String password, Date pwdResetTime);

    /**
     * 修改邮箱
     * @param username 用户名
     * @param email 邮箱
     */
    void updateEmail(String username, String email);

    /**
     * 根据角色查询用户
     * @param roleId /
     * @return /
     */
    List<User> findByRoleId(Long roleId);

    /**
     * 根据角色中的部门查询
     * @param roleId /
     * @return /
     */
    List<User> findByDeptRoleId(Long roleId);

    /**
     * 根据菜单查询
     * @param menuId 菜单ID
     * @return /
     */
    List<User> findByMenuId(Long menuId);

    /**
     * 根据Id删除
     * @param userIds /
     */
    void deleteAllByIdIn(Set<Long> userIds);

    /**
     * 根据岗位计数
     * @param roleIds /
     * @return /
     */
    int countByJobs(Set<Long> roleIds);

    /**
     * 根据部门计数
     * @param deptIds /
     * @return /
     */
    int countByDepts(Set<Long> deptIds);

    /**
     * 根据角色计数
     * @param ids /
     * @return /
     */
    int countByRoles(Set<Long> ids);
}