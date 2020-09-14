package org.dy.system.dao;

import java.io.Serializable;

/**
 * 数据访问基础接口
 * @author caiwl
 * @date 2020/9/14 9:36
 */
public interface BaseDao<T extends Serializable, PK> {
    /**
     * 根据主键删除记录
     * @param id 主键
     * @return 删除记录数
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 插入记录
     * @param record 记录
     * @return 插入数
     */
    int insert(T record);

    /**
     * 插入记录Selective
     * @param record 记录
     * @return 插入数
     */
    int insertSelective(T record);

    /**
    * 根据主键查询
    * @param id id
    * @return 记录
    */
    T selectByPrimaryKey(PK id);

    /**
     * 更新记录Selective
     * @param record 记录
     * @return 更新数
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 更新记录
     * @param record 记录
     * @return 更新数
     */
    int updateByPrimaryKey(T record);
}
