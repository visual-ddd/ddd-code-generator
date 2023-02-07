package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字段信息(数据模型)
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年01月30日 10:36:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataPropertyInfo extends Info {

    @SerializedName("propertyName")
    private String propertyName;

    @SerializedName("type")
    private String dataType;

    @SerializedName("defaultValue")
    private String defaultValue;

    @SerializedName("length")
    private Integer length;

    @SerializedName("notNull")
    private Boolean notNull;

    @SerializedName("autoIncrement")
    private Boolean autoIncrement;

    @SerializedName("precision")
    private Integer precision;

    @SerializedName("scale")
    private Integer scale;

}
