package org.dy.system.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author caiwl
 * @date 2020/9/13 21:04
 */
@Getter
@Setter
public class JobDto extends BaseDto implements Serializable {
    private Long id;
    private String name;
}
