package person.caiwenlao.domain.po;

import lombok.*;
import person.caiwenlao.base.BasePo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LogPo implements Serializable {
    private Long logId;

    private String description;

    private String logType;

    private String method;

    private String requestIp;

    private Long time;

    private String username;

    private String address;

    private String browser;

    private Date createTime;

    private String params;

    private String exceptionDetail;

    private static final long serialVersionUID = 1L;
}