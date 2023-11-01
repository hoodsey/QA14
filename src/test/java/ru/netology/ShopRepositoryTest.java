package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.NotFoundException;
import ru.netology.Product;
import ru.netology.ShopRepository;



public class ShopRepositoryTest {
    @Test
    void removeNotExistentID(){

    ShopRepository repo = new ShopRepository();
    Product product1 = new Product(1, "Банан", 40);
    Product product2 = new Product(2, "Cок", 200);
    Product product3 = new Product(3, "Кофе", 400);

    repo.add(product1);

    repo.add(product2);

    repo.add(product3);
    Assertions.assertThrows(NotFoundException.class, () -> {
        repo.removeById(4);
    });
    }
    @Test
    void removeExistentID(){

        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Банан", 40);
        Product product2 = new Product(2, "Cок", 200);
        Product product3 = new Product(3, "Кофе", 400);

        repo.add(product1);

        repo.add(product2);

        repo.add(product3);

        repo.removeById(2);
        ShopRepository expected = new ShopRepository();
        expected.add(product1);
        expected.add(product3);

        Assertions.assertArrayEquals(expected.findAll(), repo.findAll());
    }
}
