package com.wakedt.visual.businessscene.app.cmd.businesssceneversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务场景版本-指令
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