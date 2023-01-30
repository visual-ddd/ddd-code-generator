package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 10:30:59
 * describe er模型
 */
@Data
public class ERModelDsl {

    @SerializedName("dataObjects")
    private DataObjectDsl dataObjectDsl;

    @SerializedName("references")
    private DataObjectReferenceDsl dataObjectReferenceDsl;

}
