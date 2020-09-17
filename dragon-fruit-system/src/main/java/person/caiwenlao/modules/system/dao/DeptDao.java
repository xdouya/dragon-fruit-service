package person.caiwenlao.modules.system.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.Dept;
import person.caiwenlao.modules.system.domain.po.DeptPo;

import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface DeptDao extends BaseDao<DeptPo, Long> {

    /**
     * 根据 PID 查询
     * @param id pid
     * @return /
     */
    List<DeptPo> findByPid(Long id);

    /**
     * 获取顶级部门
     * @return /
     */
    List<DeptPo> findByPidIsNull();

    /**
     * 根据角色ID 查询
     * @param roleId 角色ID
     * @return /
     */
    Set<DeptPo> findByRoleId(Long roleId);

    /**
     * 判断是否存在子节点
     * @param pid /
     * @return /
     */
    int countByPid(Long pid);

    /**
     * 根据ID更新sub_count
     * @param count /
     * @param deptId /
     */
    void updateSubCntById(Integer count, Long deptId);
}