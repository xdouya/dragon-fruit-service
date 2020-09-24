package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.model.Dict;

import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface DictDao extends BaseDao<Dict, Long> {

    /**
     * 删除
     * todo 代码中要实现级联删除
     * @param ids /
     */
    void deleteByIdIn(Set<Long> ids);

    /**
     * 查询
     * @param ids /
     * @return /
     */
    List<Dict> findByIdIn(Set<Long> ids);
}