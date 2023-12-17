package com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除业务场景-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneRemoveCmd {

    /** 业务场景 ID */
    private Long id;

}