package org.dy.system.dao;

import org.dy.core.dao.BaseDao;
import org.dy.system.domain.po.JobPo;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
public interface JobDao extends BaseDao<JobPo, Long> {
    public List<JobPo> selectByUserId(long userId);
}