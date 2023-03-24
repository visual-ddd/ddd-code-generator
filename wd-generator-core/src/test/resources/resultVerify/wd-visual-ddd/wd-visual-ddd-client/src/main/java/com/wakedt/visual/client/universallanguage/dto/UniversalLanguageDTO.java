package com.wakedt.visual.client.universallanguage.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于统一语言的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于统一语言的数据传输对象")
public class UniversalLanguageDTO extends BaseDTO {

    @ApiModelProperty(value = "统一语言 ID")
    private Long id;

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "英文名")
    private String englishName;

    @ApiModelProperty(value = "定义")
    private String definition;

    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @ApiModelProperty(value = "约束")
    private String restraint;

    @ApiModelProperty(value = "举例")
    private String example;

    @ApiModelProperty(value = "所属唯一标识(组织/团队的主键id)")
    private Long identity;

}