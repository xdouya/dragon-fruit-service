package org.dy.system.service.impl;

import org.dy.system.dao.UserDao;
import org.dy.system.domain.dto.UserDto;
import org.dy.system.domain.po.UserPo;
import org.dy.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author caiwl
 * @date 2020/9/13 22:11
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    @Cacheable(key = "'username:' + #p0")
    public UserPo findByName(String userName) {
        return userDao.selectByName(userName);
    }
}
