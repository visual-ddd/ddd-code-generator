package com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 关联业务域版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionBindCmd {

    /** 应用版本ID */
    private Long id;

    /** 关联业务域列表 */
    private Set<Long> domainDesignVersionIds;

}