package com.wakedata.common.core.base;

import com.wakedata.common.core.dto.SortingField;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/1
 */
public class BaseQuery extends DTO {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty("排序")
    private List<SortingField> sortingFields;

    public List<SortingField> getSortingFields() {
        return sortingFields;
    }

    public void setSortingFields(List<SortingField> sortingFields) {
        this.sortingFields = sortingFields;
    }
}