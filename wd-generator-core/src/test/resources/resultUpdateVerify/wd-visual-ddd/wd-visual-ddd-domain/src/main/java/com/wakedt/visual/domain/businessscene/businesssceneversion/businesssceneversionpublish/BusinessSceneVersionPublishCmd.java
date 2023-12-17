package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发布业务场景版本-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionPublishCmd {

    /** 业务场景版本ID */
    private Long id;

}