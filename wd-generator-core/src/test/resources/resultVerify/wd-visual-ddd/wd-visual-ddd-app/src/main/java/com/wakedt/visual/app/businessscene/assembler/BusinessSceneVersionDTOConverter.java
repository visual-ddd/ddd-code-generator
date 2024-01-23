package com.wakedt.visual.app.businessscene.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;

import java.util.List;

/**
 * 业务场景版本数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class BusinessSceneVersionDTOConverter {

    public String entity2Json(BusinessSceneVersionDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public BusinessSceneVersionDTO json2Entity(String value) {
        return JSONUtil.toBean(value, BusinessSceneVersionDTO.class);
    }

    public String list2json(List<BusinessSceneVersionDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<BusinessSceneVersionDTO> json2list(String value) {
        return JSONUtil.toList(value, BusinessSceneVersionDTO.class);
    }

}