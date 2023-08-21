package com.wakedt.visual.businessscene.app.cmd.dslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新业务场景DSL-指令
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