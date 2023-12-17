package com.wakedt.visual.domain.application.application.applicationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增应用-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationCreateCmd {

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

}