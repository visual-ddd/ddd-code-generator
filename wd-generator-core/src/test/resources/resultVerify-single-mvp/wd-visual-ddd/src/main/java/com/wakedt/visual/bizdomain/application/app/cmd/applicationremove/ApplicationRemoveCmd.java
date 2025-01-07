package com.wakedt.visual.bizdomain.application.app.cmd.applicationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.application.domain.application.*;

/**
 * 删除应用-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRemoveCmd {

    /** 应用 ID */
    private Long id;

}