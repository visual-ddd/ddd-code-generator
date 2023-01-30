package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.enums.DataTypeEnum;
import lombok.Data;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 10:36:49
 * describe 字段信息(数据模型)
 */
@Data
public class DataPropertyInfo {

    @SerializedName("propertyName")
    private String propertyName;

    @SerializedName("dataType")
    private DataTypeEnum dataType;

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
