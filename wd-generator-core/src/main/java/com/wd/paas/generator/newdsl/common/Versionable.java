package com.wd.paas.generator.newdsl.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Versionable {

    private String version;

}
