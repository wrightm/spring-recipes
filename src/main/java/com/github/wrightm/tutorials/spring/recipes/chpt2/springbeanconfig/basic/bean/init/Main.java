package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
    	
    	final String resources = System.getProperty("user.dir") + "/src/main/resources";
        
        ApplicationContext context = 
            new GenericXmlApplicationContext("beans.xml");

        SequenceGenerator generator =
            (SequenceGenerator) context.getBean("sequenceGenerator");
        
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        
        SequenceGenerator sequenceGeneratorConstructor =
                (SequenceGenerator) context.getBean("sequenceGeneratorConstructor");
            
        System.out.println(sequenceGeneratorConstructor.getSequence());
        System.out.println(sequenceGeneratorConstructor.getSequence());
            
        SequenceGenerator sequenceGeneratorConstructorTwo =
                (SequenceGenerator) context.getBean("sequenceGeneratorConstructorTwo");
            
        System.out.println(sequenceGeneratorConstructorTwo.getSequence());
        System.out.println(sequenceGeneratorConstructorTwo.getSequence());
        
        Product aaa = (Product) context.getBean("aaa");
        Product cdrw = (Product) context.getBean("cdrw");
        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
