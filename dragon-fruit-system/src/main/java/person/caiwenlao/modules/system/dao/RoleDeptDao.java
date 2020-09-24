package person.caiwenlao.modules.system.dao;

import org.apache.ibatis.annotations.Param;
import person.caiwenlao.modules.system.domain.model.RoleDept;

/**
 * @author caiwenlao
 */
public interface RoleDeptDao {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("deptId") Long deptId);

    int insert(RoleDept record);

    int insertSelective(RoleDept record);
}