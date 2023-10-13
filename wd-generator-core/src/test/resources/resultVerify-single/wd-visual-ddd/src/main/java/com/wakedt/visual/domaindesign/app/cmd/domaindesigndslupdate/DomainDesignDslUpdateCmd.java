package com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.*;

/**
 * 更新业务域DSL-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignDslUpdateCmd {

    /** 业务域场景ID */
    private Long id;

    /** 业务域DSL */
    private String domainDesignDsl;

    /** 图形DSL */
    private String graphDsl;

}