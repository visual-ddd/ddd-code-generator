package com.wakedt.visual.domain.application.application.applicationmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑应用-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationModifyCmd {

    /** 应用 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

}