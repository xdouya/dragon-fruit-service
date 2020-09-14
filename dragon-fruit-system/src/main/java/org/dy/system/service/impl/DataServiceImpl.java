package org.dy.system.service.impl;

import org.dy.system.domain.dto.UserDto;
import org.dy.system.service.DataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 21:12
 */
@Service
public class DataServiceImpl implements DataService {
    @Override
    public List<Long> getDeptIds(UserDto userDto) {
        return null;
    }
}
