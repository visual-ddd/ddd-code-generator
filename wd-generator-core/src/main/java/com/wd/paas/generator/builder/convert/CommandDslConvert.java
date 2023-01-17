package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.constant.CmdTypeEnumConvert;
import com.wd.paas.generator.generate.element.Command;
import com.wd.paas.generator.input.CommandDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(
        uses = {CmdTypeEnumConvert.class}
)
public interface CommandDslConvert extends BaseConvert<CommandDsl, Command> {

    CommandDslConvert INSTANCE = Mappers.getMapper(CommandDslConvert.class);

    Command dto2Do(CommandDsl commandDsl);
}
