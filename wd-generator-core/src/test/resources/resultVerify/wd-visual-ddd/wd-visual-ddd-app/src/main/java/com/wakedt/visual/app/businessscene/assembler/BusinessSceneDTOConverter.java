package com.wakedt.visual.app.businessscene.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;

/**
 * 业务场景数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class BusinessSceneDTOConverter {

    public String entity2Json(BusinessSceneDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public BusinessSceneDTO json2Entity(String value) {
        return JSONUtil.toBean(value, BusinessSceneDTO.class);
    }

    public String list2json(List<BusinessSceneDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<BusinessSceneDTO> json2list(String value) {
        return JSONUtil.toList(value, BusinessSceneDTO.class);
    }

}