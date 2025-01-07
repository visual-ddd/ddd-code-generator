package com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.*;

/**
 * 删除业务场景版本-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessSceneVersionRemoveCmd {

    /** 业务场景 ID */
    private Long id;

}