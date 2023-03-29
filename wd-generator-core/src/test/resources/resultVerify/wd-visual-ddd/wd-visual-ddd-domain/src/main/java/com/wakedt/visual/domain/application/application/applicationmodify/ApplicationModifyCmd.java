package com.wakedt.visual.domain.application.application.applicationmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.application.*;

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

    /** 生成项目时的包结构 */
    private String packageName;

    /** 描述信息 */
    private String description;

}