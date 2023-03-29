package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 删除业务域版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionRemoveCmd {

    /** 业务域场景ID */
    private Long id;

}