package person.caiwenlao.modules.system.dao;

import org.apache.ibatis.annotations.Param;
import person.caiwenlao.modules.system.domain.model.RoleMenu;

/**
 * @author caiwenlao
 */
public interface RoleMenuDao {
    int deleteByPrimaryKey(@Param("menuId") Long menuId, @Param("roleId") Long roleId);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);
}