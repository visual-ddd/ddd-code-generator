package com.wakedata.common.core.base;

import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * 基础转换接口
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public interface BaseConvert<DTO, DO> {

    /**
     * dto 转 do
     *
     * @param dto DTO
     * @return DO
     */
    DO dto2Do(DTO dto);

    /**
     * do 转 dto
     *
     * @param d DO
     * @return DTO
     */
    DTO do2Dto(DO d);

    /**
     * doList 转 dtoList
     *
     * @param doList List<DO>
     * @return List<DTO>
     */
    List<DTO> doList2DtoList(List<DO> doList);

    /**
     * dtoList 转 doList
     *
     * @param dtoList List<DTO>
     * @return List<DO>
     */
    List<DO> dtoList2DoList(List<DTO> dtoList);

    /**
     * 分页转换
     *
     * @param page PageInfo<DO>
     * @return PageResultDTO<List < DTO>>
     */
    @Mapping(source = "list", target = "data")
    @Mapping(source = "pageNum", target = "pageNo")
    @Mapping(source = "total", target = "totalCount")
    PageResultDTO<List<DTO>> convertPage(PageInfo<DO> page);

}

