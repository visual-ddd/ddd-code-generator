package com.wakedt.visual.businessscene.app.cmd.businesssceneversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.businessscene.domain.businesssceneversion.*;

/**
 * 编辑业务场景版本-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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