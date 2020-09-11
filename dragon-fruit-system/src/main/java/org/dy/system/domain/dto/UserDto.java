package org.dy.system.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/4/8 21:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String id;

    private String username;

    private String password;

    private String email;
}
