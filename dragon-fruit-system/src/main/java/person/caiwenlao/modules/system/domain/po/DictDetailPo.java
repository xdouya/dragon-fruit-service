package person.caiwenlao.modules.system.domain.po;

import lombok.*;
import person.caiwenlao.base.BaseDao;
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
public class DictDetailPo extends BasePo implements Serializable {
    private Long detailId;

    private Long dictId;

    private String label;

    private String value;

    private Integer dictSort;

    private static final long serialVersionUID = 1L;
}