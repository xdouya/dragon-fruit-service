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
public class JobPo extends BasePo implements Serializable {
    private Long jobId;

    private String name;

    private Boolean enabled;

    private Integer jobSort;

    private static final long serialVersionUID = 1L;
}