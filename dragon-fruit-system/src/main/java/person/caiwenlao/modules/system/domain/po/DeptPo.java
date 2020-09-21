package person.caiwenlao.modules.system.domain.po;

import lombok.*;
import person.caiwenlao.base.BasePo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptPo extends BasePo implements Serializable {
    private Long deptId;

    private Long pid;

    private Integer subCount;

    private String name;

    private Integer deptSort;

    private Boolean enabled;
}