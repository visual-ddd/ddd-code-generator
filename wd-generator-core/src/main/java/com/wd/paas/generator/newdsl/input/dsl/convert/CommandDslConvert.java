package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
import com.wd.paas.generator.newdsl.input.dsl.CommandDsl;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface CommandDslConvert extends BaseConvert<CommandDsl, Command> {

    CommandDslConvert INSTANCE = Mappers.getMapper(CommandDslConvert.class);

    @Mapping(target = "repository", expression = "java(com.wd.paas.generator.newdsl.constant.CmdTypeEnum.of(commandDsl.getRepository()))")
    Command dto2Do(CommandDsl commandDsl);
}
