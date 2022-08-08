package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 项目
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@Data
@TableName("paas_code_generator_project")
public class ProjectDO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String projectName;

    /**
     * 描述
     */
    private String description;

    /**
     * 分组包名
     */
    private String groupPackage;

    /**
     * 版本号
     */
    private String projectVersion;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 所属用户ID
     */
    private Long userId;

}
