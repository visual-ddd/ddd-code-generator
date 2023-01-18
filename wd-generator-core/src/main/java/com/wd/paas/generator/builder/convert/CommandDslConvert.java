package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.generator.common.enums.CmdTypeEnumConvert;
import com.wd.paas.generator.generate.element.ASTCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(
        uses = {CmdTypeEnumConvert.class}
)
public interface CommandDslConvert extends BaseConvert<CommandDsl, ASTCommand> {

    CommandDslConvert INSTANCE = Mappers.getMapper(CommandDslConvert.class);

    ASTCommand dto2Do(CommandDsl commandDsl);
}
