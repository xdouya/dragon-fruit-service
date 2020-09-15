package org.dy.core.domain.po;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 持久化对象基类
 * @author caiwl
 * @date 2020/9/11 17:22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class BasePo implements Serializable {
    private String createBy;
    private String updateBy;
    private Timestamp createTime;
    private Timestamp updateTime;
}
