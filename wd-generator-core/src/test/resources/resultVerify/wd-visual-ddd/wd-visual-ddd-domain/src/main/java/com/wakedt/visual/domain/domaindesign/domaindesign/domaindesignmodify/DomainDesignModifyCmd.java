package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 编辑业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignModifyCmd {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述信息 */
    private String description;

}