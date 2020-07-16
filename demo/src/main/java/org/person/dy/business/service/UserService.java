package org.person.dy.business.service;

import org.person.dy.business.domain.dto.UserDto;

public interface UserService {
    UserDto getUserInfoById(String id);
}
