package com.wd.paas.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Versionable extends Info {

    private String version;

}
