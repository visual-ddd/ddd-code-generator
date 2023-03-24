package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 编辑统一语言
 */
@Data
@ApiModel(value = "编辑统一语言")
public class UniversalLanguageModifyDTO {

    @ApiModelProperty(value = "统一语言 ID")
    public Long id;

    @ApiModelProperty(value = "概念")
    public String conception;

    @ApiModelProperty(value = "英文名")
    public String englishName;

    @ApiModelProperty(value = "定义")
    public String definition;

    @ApiModelProperty(value = "约束")
    public String restraint;

    @ApiModelProperty(value = "举例")
    public String example;

    @ApiModelProperty(value = "所属唯一标识(组织/团队的主键id)")
    public Long identity;

}