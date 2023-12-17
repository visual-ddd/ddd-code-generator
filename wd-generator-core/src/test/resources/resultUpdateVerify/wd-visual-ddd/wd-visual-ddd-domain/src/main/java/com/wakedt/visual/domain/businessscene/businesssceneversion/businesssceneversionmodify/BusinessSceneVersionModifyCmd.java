package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务场景版本-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionModifyCmd {

    /** 业务场景 ID */
    private Long id;

    /** 描述 */
    private String description;

}