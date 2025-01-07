package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.*;

/**
 * 删除业务域版本-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionRemoveCmd {

    /** 业务域场景ID */
    private Long id;

}