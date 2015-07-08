package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.propertyfiles;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * From 2_6_i to 2_7
 * @author wrightm
 *
 */

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context =
            new GenericXmlApplicationContext("beans-propertyfiles.xml");

        String alert = context.getMessage("alert.checkout", null, Locale.US);
    	String alert_inventory = context.getMessage("alert.inventory.checkout", new Object[] { "[DVD-RW 3.0]", new Date() }, Locale.US);

        System.out.println("The I18N message for alert.checkout is: " + alert);
        System.out.println("The I18N message for alert.inventory.checkout is: " + alert_inventory);
        
        Product aaa = (Product) context.getBean("aaa");
        Product cdrw = (Product) context.getBean("cdrw");
        Product dvdrw = (Product) context.getBean("dvdrw");

        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
        cart1.addItem(aaa);
        cart1.addItem(cdrw);
        System.out.println("Shopping cart 1 contains " + cart1.getItems());

        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
        cart2.addItem(dvdrw);
        System.out.println("Shopping cart 2 contains " + cart2.getItems());

    }
}
