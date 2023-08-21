package com.wakedt.visual.application.app.cmd.businesssceneversionbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * 关联业务场景版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionBindCmd {

    /** 应用版本ID */
    private Long id;

    /** 关联业务场景列表 */
    private Set<Long> businessSceneVersionIds;

}