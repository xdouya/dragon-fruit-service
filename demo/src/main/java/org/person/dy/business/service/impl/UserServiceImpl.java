package org.person.dy.business.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.person.dy.business.dao.UserDao;
import org.person.dy.business.domain.dto.UserDto;
import org.person.dy.business.domain.po.UserPo;
import org.person.dy.business.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/4/8 21:27
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public UserDto getUserInfoById(String id) {
        UserPo userPo = userDao.listByPk(id);
        log.info(userPo.toString());
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userPo, userDto);
        return userDto;
    }
}
