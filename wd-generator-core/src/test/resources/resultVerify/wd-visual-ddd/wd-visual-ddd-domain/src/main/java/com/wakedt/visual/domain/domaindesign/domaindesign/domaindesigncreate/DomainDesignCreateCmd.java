package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 新增业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignCreateCmd {

    /** 名称 */
    private String name;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

}