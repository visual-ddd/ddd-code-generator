package com.wakedt.visual.domain.application.application.applicationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.application.*;

/**
 * 新增应用-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationCreateCmd {

    /** 团队的唯一标识 */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 生成项目时的包结构 */
    private String packageName;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

}