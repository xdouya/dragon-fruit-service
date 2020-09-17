package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.User;
import person.caiwenlao.modules.system.domain.po.UserPo;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface UserDao extends BaseDao<UserPo, Long> {
    /**
     * 根据用户名查询
     * @param username 用户名
     * @return /
     */
    UserPo findByUsername(String username);
}