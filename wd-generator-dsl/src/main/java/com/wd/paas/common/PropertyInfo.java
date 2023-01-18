package com.wd.paas.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PropertyInfo extends Info {

  private String type;

  private String access;
}
