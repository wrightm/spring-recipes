package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.lazy.init.destroy;

import java.util.List; 
import java.util.ArrayList; 

public class ShoppingCart {

    private List<Product> items = new ArrayList<Product>();

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
