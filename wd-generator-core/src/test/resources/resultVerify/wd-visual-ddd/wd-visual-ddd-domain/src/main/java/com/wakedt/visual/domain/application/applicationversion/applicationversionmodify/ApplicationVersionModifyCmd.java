package com.wakedt.visual.domain.application.applicationversion.applicationversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 编辑应用版本-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionModifyCmd {

    /** 应用版本ID */
    private Long id;

    /** 描述 */
    private String description;

}