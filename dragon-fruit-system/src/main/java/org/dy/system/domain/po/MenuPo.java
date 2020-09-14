package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author caiwl
 * @date 2020/9/14 18:06
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuPo extends BasePo implements Serializable {
    private Long menuId;

    private Long pid;

    private Integer subCount;

    private Integer type;

    private String title;

    private String name;

    private String component;

    private Integer menuSort;

    private String icon;

    private String path;

    private Boolean iFrame;

    private Boolean cache;

    private Boolean hidden;

    private String permission;

    private static final long serialVersionUID = 1L;
}