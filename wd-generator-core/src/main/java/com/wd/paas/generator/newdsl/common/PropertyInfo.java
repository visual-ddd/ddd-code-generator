package com.wd.paas.generator.newdsl.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangchensheng
 */
@Data
@AllArgsConstructor
public class PropertyInfo {

  private String name;

  private String type;

  private String description;

  private String access;
}
