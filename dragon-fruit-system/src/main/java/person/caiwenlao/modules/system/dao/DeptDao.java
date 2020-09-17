package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.DeptPo;

import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface DeptDao extends BaseDao<DeptPo, Long> {


    /**
     * 根据角色ID查找
     * @param roleId 角色ID
     * @return /
     */
    List<DeptPo> findByRoleId(Long roleId);
}