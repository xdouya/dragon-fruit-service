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
public class JobPo extends BasePo implements Serializable {
    private Long jobId;

    private String name;

    private Boolean enabled;

    private Integer jobSort;

    private static final long serialVersionUID = 1L;
}