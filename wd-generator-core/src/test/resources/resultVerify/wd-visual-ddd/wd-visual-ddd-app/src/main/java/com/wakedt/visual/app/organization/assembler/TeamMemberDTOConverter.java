package com.wakedt.visual.app.organization.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.organization.dto.TeamMemberDTO;

import java.util.List;

/**
 * 团队成员数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class TeamMemberDTOConverter {

    public String entity2Json(TeamMemberDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public TeamMemberDTO json2Entity(String value) {
        return JSONUtil.toBean(value, TeamMemberDTO.class);
    }

    public String list2json(List<TeamMemberDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<TeamMemberDTO> json2list(String value) {
        return JSONUtil.toList(value, TeamMemberDTO.class);
    }

}