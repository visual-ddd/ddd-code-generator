package com.wakedt.visual.bizdomain.application.app.cmd.applicationversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.*;

/**
 * 删除应用版本-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionRemoveCmd {

    /** 应用版本ID */
    private Long id;

}