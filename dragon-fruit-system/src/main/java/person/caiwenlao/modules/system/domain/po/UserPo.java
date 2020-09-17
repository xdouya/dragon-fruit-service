package person.caiwenlao.modules.system.domain.po;

import lombok.*;
import person.caiwenlao.base.BasePo;
import person.caiwenlao.modules.system.domain.Dept;
import person.caiwenlao.modules.system.domain.Job;
import person.caiwenlao.modules.system.domain.Role;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPo extends BasePo implements Serializable {
    private Long userId;

    private Long deptId;

    private List<RolePo> roles;

    private List<JobPo> jobs;

    private DeptPo dept;

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

    private Date pwdResetTime;

    private static final long serialVersionUID = 1L;
}