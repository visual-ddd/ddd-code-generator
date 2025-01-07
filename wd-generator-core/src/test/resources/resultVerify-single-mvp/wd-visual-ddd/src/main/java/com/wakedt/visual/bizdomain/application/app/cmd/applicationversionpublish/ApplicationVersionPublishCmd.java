package com.wakedt.visual.bizdomain.application.app.cmd.applicationversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.*;

/**
 * 发布应用版本-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionPublishCmd {

    /** 应用版本ID */
    private Long id;

}