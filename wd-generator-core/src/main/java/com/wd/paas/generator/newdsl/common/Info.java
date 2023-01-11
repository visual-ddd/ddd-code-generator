package com.wd.paas.generator.newdsl.common;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
@Builder
public class Info {

    private String title;

    private String name;

    private String description;

    private List<CodeValue> meta;
}
