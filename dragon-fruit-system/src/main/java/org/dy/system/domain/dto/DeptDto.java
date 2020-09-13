package org.dy.system.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author caiwl
 * @date 2020/9/13 21:05
 */
@Getter
@Setter
public class DeptDto extends BaseDto implements Serializable {
    private Long id;

    private String name;
}
