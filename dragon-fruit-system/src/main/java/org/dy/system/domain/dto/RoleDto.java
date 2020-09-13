package org.dy.system.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author caiwl
 * @date 2020/9/13 21:02
 */
@Getter
@Setter
public class RoleDto extends BaseDto implements Serializable {
    private Long id;

    private String name;

    private Integer level;

    private String dataScope;
}
