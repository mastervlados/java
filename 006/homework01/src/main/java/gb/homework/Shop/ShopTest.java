package gb.homework.Shop;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Common product", 300));
        products.add(new Product("God product", 5000));
        products.add(new Product("Uncommon product", 500));
        products.add(new Product("Rare product", 1000));
        shop = new Shop();
        shop.setProducts(products);
    }

   // 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   // 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
 @Test
 @DisplayName("Get most expensive product from a shop")
 public void testGetMostExpensiveProduct() {
        assertEquals("God product", shop.getMostExpensiveProduct().getTitle());
        assertEquals(5000, shop.getMostExpensiveProduct().getCost());
 }
   // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).


}