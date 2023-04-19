package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 发布业务场景版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionPublishCmd {

    /** 业务场景版本ID */
    private Long id;

}