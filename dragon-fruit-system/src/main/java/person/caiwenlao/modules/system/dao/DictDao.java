package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.Dict;
import person.caiwenlao.modules.system.domain.po.DictPo;

import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface DictDao extends BaseDao<DictPo, Long> {

    /**
     * 删除
     * todo 代码中要实现级联删除
     * @param dictIds /
     */
    void deleteByIdIn(Set<Long> dictIds);

    /**
     * 查询
     * @param ids /
     * @return /
     */
    List<Dict> findByIdIn(Set<Long> ids);
}