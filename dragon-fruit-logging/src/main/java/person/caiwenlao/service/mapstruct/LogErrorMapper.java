
package person.caiwenlao.service.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import person.caiwenlao.base.BaseMapper;
import person.caiwenlao.domain.Log;
import person.caiwenlao.service.dto.LogErrorDTO;

/**
 * @author Zheng Jie
 * @date 2019-5-22
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends BaseMapper<LogErrorDTO, Log> {

}