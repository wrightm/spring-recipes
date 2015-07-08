package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.propertyfiles;

public class Disc extends Product {

    private int capacity;

    public Disc() {
        super();
    }

    public Disc(String name, double price, double discount) {
        super(name, price, discount);
    }

    // Getters and Setters
    public void setCapacity(int capacity) { 
	this.capacity = capacity;
    } 
     
    public int getCapacity() { 
	return capacity;
    }
}
