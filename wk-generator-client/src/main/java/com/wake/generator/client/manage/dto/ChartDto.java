package com.wake.generator.client.manage.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 领域图谱DTO
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Data
public class ChartDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String chartName;

    /**
     * 作者
     */
    private String author;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime dateTime;

    /**
     * 领域包名
     */
    private String domainPackage;

    /**
     * 绘制的xml文件
     */
    private String chartXml;

    /**
     * 项目id
     */
    private Long projectId;

}