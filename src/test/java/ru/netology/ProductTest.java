package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void SetTitleTest(){
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Банан", 40);
        product1.setTitle("Яблоко");

        Assertions.assertEquals("Яблоко", product1.getTitle());
    }
    @Test
    void SetPriceTest(){
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Банан", 40);
        product1.setPrice(60);

        Assertions.assertEquals(60, product1.getPrice());
    }

}