package person.caiwenlao.modules.system.dao;

import person.caiwenlao.base.BaseDao;
import person.caiwenlao.modules.system.domain.model.DictDetail;

import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
public interface DictDetailDao extends BaseDao<DictDetail, Long> {

    /**
     * 根据DictId查找
     * @param dictId /
     * @return /
     */
    List<DictDetail> findByDictId(long dictId);

    /**
     * 根据字典名称查询
     * @param dictName /
     * @return /
     */
    List<DictDetail> findByDictName(String dictName);
}