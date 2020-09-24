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
@ToString
@EqualsAndHashCode
public class UserJob implements Serializable {
    private Long userId;

    private Long jobId;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }
}