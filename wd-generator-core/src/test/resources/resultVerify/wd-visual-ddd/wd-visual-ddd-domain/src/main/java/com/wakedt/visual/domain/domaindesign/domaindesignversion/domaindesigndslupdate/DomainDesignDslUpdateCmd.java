package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 更新业务域DSL-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignDslUpdateCmd {

    /** 业务域场景ID */
    private Long id;

    /** 业务域抽象文本描述语言 */
    private String domainDesignDsl;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;

}