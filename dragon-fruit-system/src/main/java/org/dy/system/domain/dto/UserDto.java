package org.dy.system.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.dy.core.domain.dto.BaseDto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/4/8 21:30
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseDto implements Serializable {

    private long id;

    private List<RoleDto> roles;

    private List<JobDto> jobs;

    private DeptDto dept;

    private String username;

    @JsonIgnore
    private String password;

    private String email;

    private String phone;

    private String gender;

    private String avatarName;

    private String avatarPath;

    private Boolean enabled;

    @JsonIgnore
    private Boolean isAdmin = false;

    private Date pwdResetTime;
}
