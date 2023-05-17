package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除业务场景版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionRemoveCmd {

    /** 业务场景 ID */
    private Long id;

}