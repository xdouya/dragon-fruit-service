package person.caiwenlao.modules.system.domain.model;

import lombok.*;

import java.io.Serializable;

/**
 * @author caiwenlao
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {
    private Long userId;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}