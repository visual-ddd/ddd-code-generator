package com.wakedt.visual.domain.application.applicationversion.applicationversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 发布应用版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionPublishCmd {

    /** 应用版本ID */
    private Long id;

}