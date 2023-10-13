package com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.*;

/**
 * 编辑业务域版本-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionModifyCmd {

    /** 业务域场景ID */
    private Long id;

    /** 描述 */
    private String description;

}