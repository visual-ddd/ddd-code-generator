package com.wd.paas.generator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

class SpoonTest {

    @Test
    void test() {
        Class<?> clazz = AbstractAccount.class;

        //获取类的信息
        int modifiers = clazz.getModifiers();
        System.out.println(Modifier.toString(modifiers) + " class " + clazz.getSimpleName());

        //获取类的构造函数
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name: " + parameter.getName());
                System.out.println("Parameter Type: " + parameter.getType().getName());
            }
        }

        //获取类的所有方法信息
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name: " + parameter.getName());
                System.out.println("Parameter Type: " + parameter.getType().getName());
            }
        }

        //获取类的所有属性信息
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
        }
        Assertions.assertTrue(true);
    }

}