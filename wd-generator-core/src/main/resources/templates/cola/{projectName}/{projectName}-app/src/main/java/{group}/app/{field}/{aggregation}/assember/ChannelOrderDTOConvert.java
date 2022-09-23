package com.wakedata.wk.dc.wisdom.manager.channelorder.assember;

import com.wakedata.dc.manager.refect.common.BaseConvert;
import com.wakedata.wk.dc.wisdom.manager.dto.channelorder.ChannelOrderDTO;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.channelorder.repository.model.ChannelOrderDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 带看单和DO转换器
 *
 * @author HeGuoJiang, LiuYingLen, GaoZhiYi, ZhuXueLiang
 * @date 2022-09-14 20:11:34
 * @since 1.0
 */
@Mapper
public interface ChannelOrderDTOConvert extends
    BaseConvert<ChannelOrderDTO, ChannelOrderDO> {

    ChannelOrderDTOConvert INSTANCE = Mappers.getMapper(ChannelOrderDTOConvert.class);
}
