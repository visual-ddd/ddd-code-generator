package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 编辑业务域-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignModifyCmd {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

}