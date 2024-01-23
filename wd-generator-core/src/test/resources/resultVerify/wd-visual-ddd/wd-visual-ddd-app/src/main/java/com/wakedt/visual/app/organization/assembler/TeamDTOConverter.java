package com.wakedt.visual.app.organization.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.organization.dto.TeamDTO;

import java.util.List;

/**
 * 团队数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class TeamDTOConverter {

    public String entity2Json(TeamDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public TeamDTO json2Entity(String value) {
        return JSONUtil.toBean(value, TeamDTO.class);
    }

    public String list2json(List<TeamDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<TeamDTO> json2list(String value) {
        return JSONUtil.toList(value, TeamDTO.class);
    }

}