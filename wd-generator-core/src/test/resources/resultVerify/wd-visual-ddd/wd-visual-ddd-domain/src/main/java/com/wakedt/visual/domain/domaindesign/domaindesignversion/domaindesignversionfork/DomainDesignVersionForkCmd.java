package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * Fork业务域版本-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionForkCmd {

    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

}