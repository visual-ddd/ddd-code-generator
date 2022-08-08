package com.wake.generator.client.manage.api.query;import com.wakedata.common.core.dto.PageQuery;import lombok.Data;import lombok.EqualsAndHashCode;import java.io.Serializable;@Data@EqualsAndHashCode(callSuper = true)public class ChartQuery extends PageQuery implements Serializable {    private static final long serialVersionUID = 1L;    /**     * 所属项目ID     */    private Long projectId;    /**     * 主键     */    private Long id;    /**     * 名称     */    private String chartName;    /**     * 作者     */    private String author;    /**     * 领域包名     */    private String domainPackage;}