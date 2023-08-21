package com.wakedt.visual.businessscene.app.cmd.businesssceneremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.businessscene.domain.businessscene.*;

/**
 * 删除业务场景-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneRemoveCmd {

    /** 业务场景 ID */
    private Long id;

}