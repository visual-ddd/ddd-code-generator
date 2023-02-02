package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Info;
import com.wd.paas.common.MapperInfo;
import com.wd.paas.common.ObjectReferenceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月01日 12:52:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ObjectMapperDsl extends Info {

    @SerializedName("source")
    private ObjectReferenceInfo source;

    @SerializedName("mapper")
    private List<MapperInfo> convertList;

    @SerializedName("target")
    private ObjectReferenceInfo target;

}
