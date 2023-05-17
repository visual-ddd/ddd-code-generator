package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务场景-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneModifyCmd {

    /** 业务场景 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

}