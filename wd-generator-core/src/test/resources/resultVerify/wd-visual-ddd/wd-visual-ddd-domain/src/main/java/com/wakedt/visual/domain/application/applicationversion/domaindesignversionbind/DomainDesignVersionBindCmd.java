package com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
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

    /** 当前应用关联的业务域版本ID列表 */
    private Set<Long> domainDesignVersionIds;

}