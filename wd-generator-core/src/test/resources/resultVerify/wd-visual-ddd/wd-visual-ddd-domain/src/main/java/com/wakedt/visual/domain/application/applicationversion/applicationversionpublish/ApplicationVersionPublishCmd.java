package com.wakedt.visual.domain.application.applicationversion.applicationversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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