package date20251119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 商品はnullではダメ
 * 数量はnullではダメ
 * 注文数を1増やすことができる
 * 注文数を1減らすことができる
 * 小計を計算できる
 * 増やすせるかどうか確認できる
 * 減らせるかどうか確認できる
 * 小計を計算できる(PriceとQuantity)
 */
public class OrderTest {

    @Test
    public void 商品はnullではダメ() {
        assertThrows(IllegalArgumentException.class, () -> new Order(null, new Quantity(0)));
        assertDoesNotThrow(() -> new Order(new Item("apple", new Price(100)), new Quantity(0)));
    }

    @Test
    public void 数量はnullではダメ() {
        Item item = new Item("apple", new Price(100));

        assertThrows(IllegalArgumentException.class, () -> new Order(item, null));
        assertDoesNotThrow(() -> new Order(new Item("apple", new Price(100)), new Quantity(0)));
    }

    public void 注文数を1増やすことができる() {
        Item item = new Item("apple", new Price(100));
        Order order = new Order(item, new Quantity(0));
        order.increase();
        assertEquals(new Quantity(1), order.getQty());
    }

    @Test
    public void 注文数を1減らすことができる() {
        Item item = new Item("apple", new Price(100));
        Order order = new Order(item, new Quantity(1));
        order.decrease();
        assertEquals(new Quantity(0), order.getQty());
    }

    @Test
    public void 増やせるかどうか確認できる() {
        Item apple = new Item("apple", new Price(100));
        Order order = new Order(apple, new Quantity(98)); // 98が境界値
        assertTrue(order.canIncrease());

        Order order2 = new Order(apple, new Quantity(99));
        assertFalse(order2.canIncrease());
    }

    @Test
    public void 減らせるかどうか確認できる() {
        Item apple = new Item("apple", new Price(100));
        Order order = new Order(apple, new Quantity(98));
        assertTrue(order.canDecrease());

        Order order2 = new Order(apple, new Quantity(98));
//        assertFalse(order2.canDecrease());
    }

    @Test
    public void 小計を計算できる() {
        Item apple = new Item("apple", new Price(100));
        Order order = new Order(apple, new Quantity(3));

        Price subtotal = order.calcSubTotal();
        assertEquals(new Price(300), subtotal);
    }
}
