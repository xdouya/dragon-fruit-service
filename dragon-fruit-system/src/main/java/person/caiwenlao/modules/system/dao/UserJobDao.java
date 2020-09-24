package person.caiwenlao.modules.system.dao;

import org.apache.ibatis.annotations.Param;
import person.caiwenlao.modules.system.domain.model.UserJob;

import java.util.List;

/**
 * @author caiwenlao
 */
public interface UserJobDao {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("jobId") Long jobId);

    int insert(UserJob record);

    int insertSelective(UserJob record);

    void batchInsert(List<UserJob> userJobs);
}