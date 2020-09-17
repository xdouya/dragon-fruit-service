package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.RolePo;
import person.caiwenlao.modules.system.domain.po.UserPo;

import java.util.List;

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
}