package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
import com.wd.paas.generator.newdsl.input.dsl.CommandDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface CommandDslConvert extends BaseConvert<CommandDsl, Command> {

    CommandDslConvert INSTANCE = Mappers.getMapper(CommandDslConvert.class);
}
