package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 新增业务场景版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionCreateCmd {

    /** 业务场景的唯一标识 */
    private Long businessSceneId;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

}