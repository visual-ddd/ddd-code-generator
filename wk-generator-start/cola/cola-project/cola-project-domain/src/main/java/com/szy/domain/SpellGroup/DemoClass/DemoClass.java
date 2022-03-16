
package com.szy.domain.SpellGroup.DemoClass;

import com.alibaba.cola.domain.Entity;
import lombok.Data;

/**
 * 演示代码生成
 *
 * @author shimmer
 * @date 2022-03-16
 */
@Data
@Entity
public class DemoClass implements IDemoClass {

    private List<String> name;

    public static Set<List<Integer>> execute(LabelDTO labelDTO, Collection<Set<List<Integer>>> test){
     // Do Something
     return null;
    }

}
