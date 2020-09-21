package person.caiwenlao.base;

import java.io.Serializable;

/**
 * @author caiwenlao
 * @date 2020/9/17 9:19
 */
public interface BaseDao<T extends Serializable, PK> {
    /**
     * 根据主键删除
     * @param id 主键
     * @return 删除数
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 插入
     * @param record 记录
     * @return 插入数
     */
    int insert(T record);

    /**
     * 有选择的插入
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
     * 有选择的更新
     * @param record 记录
     * @return 更新数
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 更新
     * @param record 记录
     * @return 更新数
     */
    int updateByPrimaryKey(T record);
}

