package com.wakedt.visual.domain.application.application.applicationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.application.*;

/**
 * 删除应用-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRemoveCmd {

    /** 应用 ID */
    private Long id;

}