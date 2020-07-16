package org.person.dy.business.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.person.dy.business.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:41
 */
public class BaseDaoImpl<T extends Serializable, PK extends Serializable> implements BaseDao<T, PK> {
    @Autowired
    protected SqlSession sqlSession;

    protected String mapperNameSpace;

    public BaseDaoImpl(){
        Class<T> entityClass;
        Type type = getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType){
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            //noinspection unchecked
            entityClass = (Class<T>) parameterizedType[0];
            this.mapperNameSpace = entityClass.getName().replace("domain.po", "mapper") + "Mapper";
        }
    }

    @Override
    public T listByPk(PK id) {
        return sqlSession.selectOne(MessageFormat.format("{0}.selectByPrimaryKey", this.mapperNameSpace), id);
    }

    @Override
    public Integer insert(T entity) {
        return sqlSession.insert(MessageFormat.format("{0}.insert", this.mapperNameSpace), entity);
    }

    @Override
    public Integer insertSelective(T entity) {
        return sqlSession.insert(MessageFormat.format("{0}.insertSelective", this.mapperNameSpace), entity);
    }

    @Override
    public Integer update(T entity) {
        return sqlSession.update(MessageFormat.format("{0}.updateByPrimaryKey", this.mapperNameSpace), entity);
    }

    @Override
    public Integer updateSelective(T entity) {
        return sqlSession.update(MessageFormat.format("{0}.updateByPrimaryKeySelective", this.mapperNameSpace), entity);
    }

    @Override
    public Integer deleteByPk(PK id) {
        return sqlSession.delete(MessageFormat.format("{0}.deleteByPrimaryKey", this.mapperNameSpace), id);
    }

    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public List<T> listAllByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Integer batchInsert(List<T> entityList) {
        return null;
    }

    @Override
    public Integer batchDeleteByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Integer batchDeleteByPks(List<PK> ids) {
        return null;
    }

    @Override
    public Integer countRecord(Map<String, Object> params) {
        return null;
    }
}
