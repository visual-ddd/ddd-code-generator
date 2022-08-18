package com.wake.generator.client.manage.dto;

import lombok.Data;

/**
 * 图谱存储dto
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date
 */
@Data
public class ChartStorageDto {

    /**
     * 领域Id
     */
    private Long domainId;

    /**
     * 图谱内容
     */
    private String xml;

}
