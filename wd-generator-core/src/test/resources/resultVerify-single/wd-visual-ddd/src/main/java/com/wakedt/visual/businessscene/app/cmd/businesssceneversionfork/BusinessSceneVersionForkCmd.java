package com.wakedt.visual.businessscene.app.cmd.businesssceneversionfork;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.businessscene.domain.businesssceneversion.*;

/**
 * Fork业务场景版本-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionForkCmd {

    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

}