package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 获取当前登录账号的权限信息，包含所属组织、团队等信息
 */
@Data
@ApiModel(value = "获取当前登录账号的权限信息，包含所属组织、团队等信息")
public class GetAccountRole {

}