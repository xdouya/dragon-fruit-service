package person.caiwenlao.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * 通用持久化对象，所有数据库表必须又这几个字段
 * @author caiwenlao
 * @date 2020/9/17 9:18
 */
@Getter
@Setter
@ToString
public abstract class BasePo {
    private String createBy;

    private String updateBy;

    private Timestamp createTime;

    private Timestamp updateTime;
}
