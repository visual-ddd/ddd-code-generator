package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 发布业务场景版本-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionPublishCmd {

    /** 业务场景版本ID */
    private Long id;

}