package com.wakedt.visual.app.application.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;

import java.util.List;

/**
 * 应用版本数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class ApplicationVersionDTOConverter {

    public String entity2Json(ApplicationVersionDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public ApplicationVersionDTO json2Entity(String value) {
        return JSONUtil.toBean(value, ApplicationVersionDTO.class);
    }

    public String list2json(List<ApplicationVersionDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<ApplicationVersionDTO> json2list(String value) {
        return JSONUtil.toList(value, ApplicationVersionDTO.class);
    }

}