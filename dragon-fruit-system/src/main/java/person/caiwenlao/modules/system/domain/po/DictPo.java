package person.caiwenlao.modules.system.domain.po;

import lombok.*;
import person.caiwenlao.base.BaseDao;
import person.caiwenlao.base.BasePo;
import person.caiwenlao.modules.system.domain.DictDetail;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author caiwenlao
 * @date 2020/09/17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DictPo extends BasePo implements Serializable {
    private Long dictId;

    private String name;

    private List<DictDetailPo> dictDetails;

    private String description;

    private static final long serialVersionUID = 1L;
}