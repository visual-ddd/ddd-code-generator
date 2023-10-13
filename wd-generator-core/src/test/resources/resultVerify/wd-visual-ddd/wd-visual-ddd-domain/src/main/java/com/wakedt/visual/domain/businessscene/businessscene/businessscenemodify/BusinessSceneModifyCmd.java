package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 编辑业务场景-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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