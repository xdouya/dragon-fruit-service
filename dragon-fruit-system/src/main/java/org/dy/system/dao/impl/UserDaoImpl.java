package org.dy.system.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.dy.system.domain.po.UserPo;
import org.dy.system.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/4/8 21:37
 */
@Repository
@Slf4j
public class UserDaoImpl extends BaseDaoImpl<UserPo, String> implements UserDao {

}
