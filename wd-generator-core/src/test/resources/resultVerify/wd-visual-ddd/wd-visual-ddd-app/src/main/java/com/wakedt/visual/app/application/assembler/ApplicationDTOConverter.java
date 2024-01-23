package com.wakedt.visual.app.application.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.application.dto.ApplicationDTO;

/**
 * 应用数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class ApplicationDTOConverter {

    public String entity2Json(ApplicationDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public ApplicationDTO json2Entity(String value) {
        return JSONUtil.toBean(value, ApplicationDTO.class);
    }

    public String list2json(List<ApplicationDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<ApplicationDTO> json2list(String value) {
        return JSONUtil.toList(value, ApplicationDTO.class);
    }

}