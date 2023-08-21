package com.wakedt.visual.businessscene.app.cmd.businesssceneremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除业务场景-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneRemoveCmd {

    /** 业务场景 ID */
    private Long id;

}