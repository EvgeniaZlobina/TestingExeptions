import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ShopRepositoreTest {
    @Test
    public void TestShopRepositoreremoteID() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Книга",100);
        Product product2 = new Product(2, "Журнал",200);
        Product product3 = new Product(3, "Газета",300);
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);
        Product [] actual = repo.findAll();
        Product [] expected = {product1, product3};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void TestShopRepositoreremoteIDLast() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Книга",100);
        Product product2 = new Product(2, "Журнал",200);
        Product product3 = new Product(3, "Газета",300);
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(3);
        Product [] actual = repo.findAll();
        Product [] expected = {product1, product2};
        Assertions.assertArrayEquals(expected,actual);
    }
}
