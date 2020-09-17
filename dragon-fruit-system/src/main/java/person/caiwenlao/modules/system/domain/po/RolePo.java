package person.caiwenlao.modules.system.domain.po;

import lombok.*;
import person.caiwenlao.base.BasePo;
import person.caiwenlao.modules.system.domain.Dept;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RolePo extends BasePo implements Serializable {
    private Long roleId;

    private String name;

    private List<MenuPo> menus;

    private List<DeptPo> depts;

    private Integer level;

    private String description;

    private String dataScope;

    private static final long serialVersionUID = 1L;
}