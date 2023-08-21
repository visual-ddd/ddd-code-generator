package com.wakedt.visual.application.app.cmd.applicationversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.application.domain.applicationversion.*;

/**
 * 删除应用版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionRemoveCmd {

    /** 应用版本ID */
    private Long id;

}