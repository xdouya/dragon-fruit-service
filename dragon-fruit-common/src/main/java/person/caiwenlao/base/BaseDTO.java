package person.caiwenlao.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;

/**
 * @author caiwenlao
 * @date 2019年10月24日20:48:53
 */
@Getter
@Setter
@ToString
public abstract class BaseDTO  implements Serializable {

    private String createBy;

    private String updatedBy;

    private Timestamp createTime;

    private Timestamp updateTime;
}