package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 更新业务域DSL-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
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