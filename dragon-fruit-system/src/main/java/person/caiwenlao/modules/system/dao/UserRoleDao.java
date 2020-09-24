package person.caiwenlao.modules.system.dao;

import org.apache.ibatis.annotations.Param;
import person.caiwenlao.modules.system.domain.model.UserRole;

import java.util.List;

/**
 * @author caiwenlao
 */
public interface UserRoleDao {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    void batchInsert(List<UserRole> userRoles);
}