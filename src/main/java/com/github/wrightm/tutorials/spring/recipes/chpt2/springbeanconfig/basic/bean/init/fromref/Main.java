package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.fromref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
    	
    	
    	final ApplicationContext context = 
            new GenericXmlApplicationContext("chp2/beans-ref.xml");

        SequenceGenerator generator =
            (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        
        SequenceGenerator generator2 =
                (SequenceGenerator) context.getBean("sequenceGenerator2");

        System.out.println(generator2.getSequence());
        System.out.println(generator2.getSequence());
            
        SequenceGenerator generator3 =
                (SequenceGenerator) context.getBean("sequenceGenerator3");

        System.out.println(generator3.getSequence());
        System.out.println(generator3.getSequence());
        
        SequenceGenerator generator4 =
                (SequenceGenerator) context.getBean("sequenceGenerator4");

        System.out.println(generator4.getSequence());
        System.out.println(generator4.getSequence());
    }
}
