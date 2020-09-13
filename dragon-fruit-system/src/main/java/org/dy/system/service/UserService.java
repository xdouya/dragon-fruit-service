package org.dy.system.service;

import org.dy.system.domain.dto.UserDto;

/**
 * @author caiwl
 * @date 2020/9/12 11:16
 */
public interface UserService {
    UserDto findByName(String userName);
}
