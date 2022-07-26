package com.wake.generator.application;

import java.util.List;

/**
 * 基础转换接口
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 21:20
 */
public interface BaseConvert<T, D> {

    /**
     * dto 转 entity
     *
     * @param dto dto
     * @return entity
     */
    D dto2entity(T dto);

    /**
     * dtoList 转 entityList
     *
     * @param dtoList dto列表
     * @return entity列表
     */
    List<D> dtoList2entityList(List<T> dtoList);

}
