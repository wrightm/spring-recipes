package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.propertyfiles;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Value;

public abstract class Product {

	
    private String name;
    private double price;
    
    @Value("#{specialcustomer.discount}")
    private double discount;
    
    public Product() {}

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
	this.discount = discount;
    }

    // Getters and Setters
    public void setName(String name) { 
	this.name = name;
    }
    
    public void setPrice(double price) { 
	this.price = price;
    }

    public void setDiscount(double discount) { 
	this.discount = discount;
    }

    public String getName() { 
	return name;
    }

    public double getPrice() { 
	return price;
    }

    public double getDiscount() { 
	return discount;
    }

    public String toString() {
	DecimalFormat df = new DecimalFormat("#%");
        return name + " " + price + " (" + df.format(discount) + " discount!)";
    }
}
