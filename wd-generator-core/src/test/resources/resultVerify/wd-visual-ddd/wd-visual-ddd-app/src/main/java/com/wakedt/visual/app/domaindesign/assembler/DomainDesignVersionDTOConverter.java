package com.wakedt.visual.app.domaindesign.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;

/**
 * 业务域版本数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class DomainDesignVersionDTOConverter {

    public String entity2Json(DomainDesignVersionDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public DomainDesignVersionDTO json2Entity(String value) {
        return JSONUtil.toBean(value, DomainDesignVersionDTO.class);
    }

    public String list2json(List<DomainDesignVersionDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<DomainDesignVersionDTO> json2list(String value) {
        return JSONUtil.toList(value, DomainDesignVersionDTO.class);
    }

}