package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.model.Job;

import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface JobDao extends BaseDao<Job, Long> {
    /**
     * 根据用户ID查找
     * @param userId 用户ID
     * @return /
     */
    List<Job> findByUserId(Long userId);

    /**
     * 根据名称查询
     * @param name 名称
     * @return /
     */
    Job findByName(String name);

    /**
     * 根据Id删除
     * @param ids /
     */
    void deleteAllByIdIn(Set<Long> ids);
}