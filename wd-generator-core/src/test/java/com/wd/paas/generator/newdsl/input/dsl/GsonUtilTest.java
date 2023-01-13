package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import com.wd.paas.generator.newdsl.util.GsonUtil;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GsonUtilTest {

    @Test
    public void test() throws IOException {
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/dsl.json", ApplicationDsl.class);
        Assert.assertNotNull(applicationDsl);
    }
}
