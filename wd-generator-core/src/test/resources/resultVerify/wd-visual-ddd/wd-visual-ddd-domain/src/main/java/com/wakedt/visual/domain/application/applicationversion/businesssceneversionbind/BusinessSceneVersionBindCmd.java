package com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.applicationversion.*;

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