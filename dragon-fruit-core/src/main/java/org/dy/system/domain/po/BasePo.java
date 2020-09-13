package org.dy.system.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
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
public abstract class BasePo implements Serializable {
    private String createBy;
    private String updatedBy;
    private Timestamp createTime;
    private Timestamp updateTime;
}
