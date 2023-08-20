package com.wakedt.visual.domain.application.applicationversion.applicationversionfork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Fork应用版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionForkCmd {

    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

}