package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dy.core.domain.po.BasePo;

import java.io.Serializable;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeptPo extends BasePo implements Serializable {
    private Long deptId;

    private Long pid;

    private Integer subCount;

    private String name;

    private Integer deptSort;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;
}