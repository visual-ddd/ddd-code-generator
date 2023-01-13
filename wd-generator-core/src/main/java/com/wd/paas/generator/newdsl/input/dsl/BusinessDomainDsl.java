package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessDomainDslConvert;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 描述一个完整业务提供的原子能力，以及实现细节
 *
 * @author shimmer
 */
@Data
public class BusinessDomainDsl implements ElementBuildable {

    @SerializedName("info")
    private Info info;

    @SerializedName("versionable")
    private Versionable versionable;

    @SerializedName("domainModel")
    private DomainModelDsl domainModel;

    @SerializedName("dataModel")
    private DataModelDsl dataModel;

    @SerializedName("queryModel")
    private QueryModelDsl queryModel;

    @SerializedName("objectMapper")
    private ObjectMapperModelDsl objectMapperModel;

    @SerializedName("vision")
    private String vision;

    @SerializedName("document")
    private String document;

    @Override
    public BusinessDomain build() {
        BusinessDomain businessDomain = BusinessDomainDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(domainModel).map(ElementBuildable::build).ifPresent(elements::add);
        Optional.ofNullable(dataModel).map(ElementBuildable::build).ifPresent(elements::add);
        Optional.ofNullable(queryModel).map(ElementBuildable::build).ifPresent(elements::add);
        Optional.ofNullable(objectMapperModel).map(ElementBuildable::build).ifPresent(elements::add);
        businessDomain.addAll(elements);
        return businessDomain;
    }
}
