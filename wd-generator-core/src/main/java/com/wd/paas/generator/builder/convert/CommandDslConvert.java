package com.wd.paas.generator.builder.convert;

import com.wd.paas.common.enums.RepositoryTypeEnumConvert;
import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.generator.generate.element.CommandNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(
        uses = {RepositoryTypeEnumConvert.class}
)
public interface CommandDslConvert extends BaseConvert<CommandDsl, CommandNode> {

    CommandDslConvert INSTANCE = Mappers.getMapper(CommandDslConvert.class);

    CommandNode dto2Do(CommandDsl commandDsl);
}
