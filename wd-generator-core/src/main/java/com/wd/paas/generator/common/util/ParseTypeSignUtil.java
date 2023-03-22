package com.wd.paas.generator.common.util;

import com.wd.paas.generator.common.context.ElementContent;
import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.generate.element.ElementNode;
import com.wd.paas.generator.generate.element.EntityNode;
import com.wd.paas.generator.generate.element.EnumNode;
import com.wd.paas.generator.generate.element.ValueObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTypeSignUtil {

    public static final String PATTERN = "\\[([^]]*):([^]]*)]";

    public static String parse(String typeSign) {
        if (StringUtils.isBlank(typeSign)) {
            return "NoType";
        }
        if ("void".equals(typeSign)) {
            return "Void";
        }

        Pattern r = Pattern.compile(PATTERN);
        Matcher m = r.matcher(typeSign);
        String result = typeSign;
        while (m.find()) {
            String elementId = m.group(2);
            ElementContent elementContent = ThreadLocalUtil.get(elementId);
            String name = Optional.ofNullable(elementContent)
                    .map(ElementContent::getElementNode)
                    .map(ElementNode::getName).orElse("NotFoundType");
            result = m.replaceAll(name);
        }
        return result;
    }

    public static String parseDTOField(String typeSign) {
        if (StringUtils.isBlank(typeSign)) {
            return "NoType";
        }

        Pattern r = Pattern.compile(PATTERN);
        Matcher m = r.matcher(typeSign);
        String result = typeSign;
        while (m.find()) {
            String elementId = m.group(2);
            ElementContent elementContent = ThreadLocalUtil.get(elementId);
            ElementNode elementNode = Optional.ofNullable(elementContent)
                    .map(ElementContent::getElementNode).orElse(null);
            String name;
            if (elementNode instanceof EnumNode) {
                name = "Integer";
            } else if (elementNode instanceof EntityNode) {
                name = elementNode.getName().concat("Request");
            } else if (elementNode instanceof ValueObjectNode) {
                name = elementNode.getName().concat("Request");
            } else {
                name = Optional.ofNullable(elementNode).map(ElementNode::getName).orElse("NotFoundType");
            }
            result = m.replaceAll(name);
        }
        return result;
    }

    public static String getFirstId(String typeSign) {
        if (StringUtils.isBlank(typeSign)) {
            return "NoType";
        }

        Pattern r = Pattern.compile(PATTERN);
        Matcher m = r.matcher(typeSign);
        String result = null;
        if (m.find()) {
            result = m.group(2);
        }
        return result;
    }

    public static void main(String[] args) {
        final String string = "Long";
        System.out.println(parse(string));
    }
}
