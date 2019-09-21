package com.designpattern;

import java.util.HashMap;

abstract class Product {
    abstract Product createProduct();
    abstract public Integer getProductId();
}

class OneProduct extends Product{
    private Integer productId=0;
    static {
        FactoryProduct.registerProduct("1", new OneProduct());
    }

    public Product createProduct() {
        return new OneProduct();
    }

    public Integer getProductId() {
        productId = productId+1;
        return productId;
    }
}

class FactoryProduct {
    private static HashMap<String, Product> hashMap = new HashMap<>();

    public static void registerProduct(String id, Product product) {
        hashMap.put(id,product);
    }

    public Product createProduct(String id) {
        return (Product)hashMap.get(id).createProduct();
    }
}


public class FactoryPattern {

    public static void main(String args[]) {
        FactoryProduct factoryProduct = new FactoryProduct();
        OneProduct oneProduct = new OneProduct();
        Product product = factoryProduct.createProduct("1");
        Integer id;
        id = product.getProductId();
        System.out.println(id);
        id = product.getProductId();
        System.out.println(id);
        product = factoryProduct.createProduct("1");
        id = product.getProductId();
        System.out.println(id);

    }
}

