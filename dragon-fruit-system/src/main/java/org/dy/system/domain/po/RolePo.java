package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dy.core.domain.po.BasePo;

import java.io.Serializable;
import java.util.List;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RolePo extends BasePo implements Serializable {
    private Long roleId;

    private List<MenuPo> menus;

    private List<DeptPo> depts;

    private String name;

    private Integer level;

    private String description;

    private String dataScope;

    private static final long serialVersionUID = 1L;
}