package com.wake.generator.client.manage.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class ProjectDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    /**
     * 所属用户ID
     */
    private Long userId;

}
