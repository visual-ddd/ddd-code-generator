package com.wakedt.visual.application.app.cmd.applicationmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.application.domain.application.*;

/**
 * 编辑应用-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationModifyCmd {

    /** 应用 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

}