package org.person.dy.business.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.person.dy.business.dao.UserDao;
import org.person.dy.business.domain.po.UserPo;
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
