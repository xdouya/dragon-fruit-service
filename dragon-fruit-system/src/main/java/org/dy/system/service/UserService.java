package org.dy.system.service;

import org.dy.system.domain.dto.UserDto;

public interface UserService {
    UserDto getUserInfoById(String id);
}
