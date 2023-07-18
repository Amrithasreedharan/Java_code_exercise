package com.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
//creating collection contain object of product class

public class FilterDemoOne {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"hp",25000));
        productList.add(new Product(2,"mac",55000));
        productList.add(new Product(3,"dell",28000));
        productList.add(new Product(4,"lenova",35000));
        productList.add(new Product(5,"sony",23000));


        //System.out.println(productList);

        //filter based on price of object
        productList.stream()
                            .filter(p-> p.price>25000)
                                                    .forEach(pr-> System.out.println(pr.price));
    }
}
