package com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 更新业务场景DSL-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionDSLUpdateCmd {

    /** 业务场景版本ID */
    private Long id;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;

    /** 业务场景抽象文本描述语言 */
    private String businessSceneDsl;

}