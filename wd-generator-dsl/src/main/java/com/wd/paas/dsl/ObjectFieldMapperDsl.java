package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.MapperInfo;
import lombok.Data;

import java.util.List;

@Data
public class ObjectFieldMapperDsl {

    @SerializedName("mapper")
    private List<MapperInfo> mapperList;

}
