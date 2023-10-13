package com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 更新业务场景DSL-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionDSLUpdateCmd {

    /** 业务场景版本ID */
    private Long id;

    /** 图形DSL */
    private String graphDsl;

    /** 业务场景DSL */
    private String businessSceneDsl;

}