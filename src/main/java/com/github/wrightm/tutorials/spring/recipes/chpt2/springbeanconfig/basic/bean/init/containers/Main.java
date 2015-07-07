package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * From 2-4-i to 2-4-iv
 * 
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = 
            new GenericXmlApplicationContext("beans-container.xml");

        SequenceGenerator generator =
            (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        
        SequenceGenerator generator2 =
                (SequenceGenerator) context.getBean("sequenceGenerator2");

        System.out.println(generator2.getSequence());
        System.out.println(generator2.getSequence());
        
        SequenceGeneratorMap generatorMap =
                (SequenceGeneratorMap) context.getBean("sequenceGeneratorMap");

        System.out.println(generatorMap.getSequence());
        System.out.println(generatorMap.getSequence());
        
        SequenceGeneratorProperties generatorProperties =
                (SequenceGeneratorProperties) context.getBean("sequenceGeneratorProperties");

        System.out.println(generatorProperties.getSequence());
        System.out.println(generatorProperties.getSequence());
        
        SequenceGeneratorList generatorList =
                (SequenceGeneratorList) context.getBean("sequenceGeneratorList");

        System.out.println(generatorList.getSequence());
        System.out.println(generatorList.getSequence());
        
        SequenceGeneratorSet generatorSet =
                (SequenceGeneratorSet) context.getBean("sequenceGeneratorSet");

        System.out.println(generatorSet.getSequence());
        System.out.println(generatorSet.getSequence());
        
    }
}
