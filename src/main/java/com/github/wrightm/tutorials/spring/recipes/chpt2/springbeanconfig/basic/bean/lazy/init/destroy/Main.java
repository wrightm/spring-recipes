package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.lazy.init.destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * From 2_8_i to 2_8_ii
 * @author wrightm
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context =
            new GenericXmlApplicationContext("chp2/beans-lazy-init-destroy.xml");


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

	Cashier cashier = (Cashier) context.getBean("cashier");
	cashier.checkout(cart1);
	cashier.checkout(cart2);
    }
}
