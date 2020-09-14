package org.dy.system.dao;

import org.dy.system.domain.po.UserPo;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
public interface UserDao extends BaseDao<UserPo, Long>{
    UserPo selectByName(String userName);
}