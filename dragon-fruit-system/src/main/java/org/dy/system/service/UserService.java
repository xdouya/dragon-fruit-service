package org.dy.system.service;

import org.dy.system.domain.dto.UserDto;
import org.dy.system.domain.po.UserPo;

/**
 * @author caiwl
 * @date 2020/9/12 11:16
 */
public interface UserService {
    UserPo findByName(String userName);
}
