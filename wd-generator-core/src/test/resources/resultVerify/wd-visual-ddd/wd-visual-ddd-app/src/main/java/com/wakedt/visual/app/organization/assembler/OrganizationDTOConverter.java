package com.wakedt.visual.app.organization.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;

import java.util.List;

/**
 * 组织数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class OrganizationDTOConverter {

    public String entity2Json(OrganizationDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public OrganizationDTO json2Entity(String value) {
        return JSONUtil.toBean(value, OrganizationDTO.class);
    }

    public String list2json(List<OrganizationDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<OrganizationDTO> json2list(String value) {
        return JSONUtil.toList(value, OrganizationDTO.class);
    }

}