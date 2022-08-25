package com.wake.generator.client.generete.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 领域图谱DTO
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Data
public class GenerateDomainDto {

    private static final long serialVersionUID = 1L;

    /**
     * 领域id
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
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    /**
     * 领域名
     */
    private String domainPackage;

}