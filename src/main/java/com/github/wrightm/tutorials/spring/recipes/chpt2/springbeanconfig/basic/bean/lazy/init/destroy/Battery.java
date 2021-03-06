package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.lazy.init.destroy;


public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    // Getters and Setters
    public void setRechargeable(boolean rechargeable) { 
	this.rechargeable = rechargeable;
    } 
     
    public boolean getRechargeable() { 
	return rechargeable;
    }
}
