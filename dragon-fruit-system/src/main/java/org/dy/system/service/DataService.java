package org.dy.system.service;

import org.dy.system.domain.dto.UserDto;

import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/13 21:34
 */
public interface DataService {

    /**
     * 获取数据权限
     * @param userDto userDto
     * @return deptIds
     */
    List<Long> getDeptIds(UserDto userDto);
}
