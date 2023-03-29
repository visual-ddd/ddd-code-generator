package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

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