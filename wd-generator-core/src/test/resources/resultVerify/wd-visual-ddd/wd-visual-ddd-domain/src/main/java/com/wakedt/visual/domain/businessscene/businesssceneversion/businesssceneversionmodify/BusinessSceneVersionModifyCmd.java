package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 编辑业务场景版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionModifyCmd {

    /** 业务场景 ID */
    private Long id;

    /** 描述信息 */
    private String description;

}