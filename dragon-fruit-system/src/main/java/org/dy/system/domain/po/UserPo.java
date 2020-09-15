package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dy.core.domain.po.BasePo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPo extends BasePo implements Serializable {
    private Long userId;

    private List<RolePo> roles;

    private List<JobPo> jobs;

    private DeptPo dept;

    private Long deptId;

    private String username;

    private String nickName;

    private String gender;

    private String phone;

    private String email;

    private String avatarName;

    private String avatarPath;

    private String password;

    private Boolean isAdmin;

    private Long enabled;

    private Timestamp pwdResetTime;
}