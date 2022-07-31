package com.wake.generator.client.generete.dto.shape;

import com.wake.generator.client.generete.common.DomainShapeEnum;
import com.wake.generator.client.generete.dto.DomainDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 聚合Dto
 *
 * @author ZhuXueLiang
 * @date 2022/7/28
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AggregationDto extends DomainDto {

    private static final long serialVersionUID = 1L;

    /**
     * 类型
     */
    private DomainShapeEnum type = DomainShapeEnum.AGGREGATION;

}
