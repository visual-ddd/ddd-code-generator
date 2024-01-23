package com.wakedt.visual.app.domaindesign.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;

/**
 * 业务域数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class DomainDesignDTOConverter {

    public String entity2Json(DomainDesignDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public DomainDesignDTO json2Entity(String value) {
        return JSONUtil.toBean(value, DomainDesignDTO.class);
    }

    public String list2json(List<DomainDesignDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<DomainDesignDTO> json2list(String value) {
        return JSONUtil.toList(value, DomainDesignDTO.class);
    }

}