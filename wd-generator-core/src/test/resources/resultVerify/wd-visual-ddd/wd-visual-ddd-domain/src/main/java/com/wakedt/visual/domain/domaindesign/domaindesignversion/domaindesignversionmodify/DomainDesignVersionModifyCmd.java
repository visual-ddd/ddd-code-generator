package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 编辑业务域版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionModifyCmd {

    /** 业务域场景ID */
    private Long id;

    /** 描述信息 */
    private String description;

}