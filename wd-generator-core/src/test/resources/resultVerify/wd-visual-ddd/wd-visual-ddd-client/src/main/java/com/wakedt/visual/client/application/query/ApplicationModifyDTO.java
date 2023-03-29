package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 编辑应用
 */
@Data
@ApiModel(value = "编辑应用")
public class ApplicationModifyDTO {

    @ApiModelProperty(value = "应用 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "生成项目时的包结构")
    public String packageName;

    @ApiModelProperty(value = "描述信息")
    public String description;

}