package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GsonUtilTest {

    @Test
    public void test() throws IOException {
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/dsl.json", ApplicationDsl.class);
        Assert.assertNotNull(applicationDsl);
    }
}
