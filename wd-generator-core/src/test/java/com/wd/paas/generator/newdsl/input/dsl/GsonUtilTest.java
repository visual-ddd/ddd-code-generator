package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
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
        String json = IOUtils.toString(Files.newInputStream(Paths.get("./src/test/resources/dsl.json")), StandardCharsets.UTF_8);
        ApplicationDsl applicationDsl = GsonUtil.fromJson(json, ApplicationDsl.class);
        Assert.assertNotNull(applicationDsl);
        System.out.println(GsonUtil.toJson(applicationDsl));
    }
}
