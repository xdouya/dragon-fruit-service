package org.person.dy.business.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T extends Serializable, PK extends Serializable> {
    T listByPk(PK id);

    Integer insert(T entity);

    Integer insertSelective(T entity);

    Integer update(T entity);

    Integer updateSelective(T entity);

    Integer deleteByPk(PK id);

    //以下需要手动在mapper.xml文件中添加
    List<T> listAll();

    List<T> listAllByMap(Map<String, Object> params);

    Integer batchInsert(List<T> entityList);

    Integer batchDeleteByMap(Map<String, Object> params);

    Integer batchDeleteByPks(List<PK> ids);

    Integer countRecord(Map<String, Object> params);

}
