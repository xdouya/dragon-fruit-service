package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 持久化对象基类
 * @author caiwl
 * @date 2020/9/11 17:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class BasePo {
    private String id;
    private String createdBy;
    private Date createTime;
    private String lastUpdatedBy;
    private Date lastUpdateTime;
    private String lastUpdateIp;
    private Integer version;
}
