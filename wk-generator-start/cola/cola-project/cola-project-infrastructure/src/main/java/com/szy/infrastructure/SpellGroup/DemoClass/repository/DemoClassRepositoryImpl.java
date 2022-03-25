
package com.szy.domain.SpellGroup.DemoClass;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

import javax.annotation.Resource;

/**
 * $description
 *
 * @author shimmer
 * @date 2022-03-25
 */
@Slf4j
@Component
public class DemoClassRespositoryImpl implements DemoClassRespository {

    @Resource
    private DemoClassMapper mapper;

    @Override
    public Long createDemoClass (DemoClass aggregation){
        DemoClassDO aggregationDO = BeanUtil.copy(aggregation, DemoClass.class);
        mapper.insert(aggregationDO);
        return aggregationDO.getId();
    }

    @Override
    public void updateDemoClass (DemoClass aggregation){
        DemoClassDO aggregationDO = BeanUtil.copy(aggregation, DemoClass.class);
        mapper.updateById(aggregationDO);
    }

    @Override
    public void deleteDemoClass (Long id){
        DemoClassDO aggregationDO = BeanUtil.copy(aggregation, DemoClass.class);
        mapper.deleteById(id);
    }

    @Override
    public List<DemoClass> selectDemoClass (){
        DemoClassDO aggregationDO = BeanUtil.copy(aggregation, DemoClass.class);

        return mapper.selectList(null);
    }
}
