package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.po.JobPo;

import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface JobDao extends BaseDao<JobPo, Long> {
    /**
     * 根据用户ID查找
     * @param userId 用户ID
     * @return /
     */
    List<JobPo> findByUserId(Long userId);
}