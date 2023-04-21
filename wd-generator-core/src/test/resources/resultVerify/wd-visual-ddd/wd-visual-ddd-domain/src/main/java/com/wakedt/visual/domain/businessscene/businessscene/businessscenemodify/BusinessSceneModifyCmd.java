package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businessscene.*;

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