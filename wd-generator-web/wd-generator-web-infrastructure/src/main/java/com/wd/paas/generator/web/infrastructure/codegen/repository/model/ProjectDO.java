package com.wd.paas.generator.web.infrastructure.codegen.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 项目实体类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Data
@TableName("paas_code_generator_project_new")
public class ProjectDO {

    /** 项目id */
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 所属用户 */
    private Long userId;

    /** 项目名 */
    private String projectName;

    /** 项目描述 */
    private String projectDesc;

    /** 项目版本号 */
    private String projectVersion;

    /** 项目作者 */
    private String projectAuthor;

    /** 包路径 */
    private String packagePath;

}
