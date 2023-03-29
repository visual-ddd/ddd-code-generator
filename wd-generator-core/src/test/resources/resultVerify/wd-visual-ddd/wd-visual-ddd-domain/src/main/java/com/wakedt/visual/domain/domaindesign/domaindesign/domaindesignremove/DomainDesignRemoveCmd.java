package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 删除业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignRemoveCmd {

    /** 业务域 ID */
    private Long id;

}