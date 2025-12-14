package date20251119;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 名前にnullは使えない
 * 名前に空文字は使えない
 * 価格にnullは使えない
 * 複数個の価格を計算できる
 */
public class ItemTest {

    @Test
    public void 名前にnullは使えない() {

        // 名前がnullだとエラーになる
        assertThrows(IllegalArgumentException.class, () -> new Item(null, new Price(0)));
        // 名前がnullでなければエラーにならない
        assertDoesNotThrow(() -> new Item("a", new Price(0)));
    }


    @Test
    public void 名前に空文字は使えない() {
        assertThrows(IllegalArgumentException.class, () -> new Item("", new Price(0)));
        assertDoesNotThrow(() -> new Item(" ", new Price(0)));
    }

    @Test
    public void 価格にnullは使えない() {
        assertThrows(IllegalArgumentException.class, () -> new Item("a", null));
        assertDoesNotThrow(() -> new Item("a", new Price(0)));
    }

    @Test
    public void 複数個の価格を計算できる() {
        Item apple = new Item("apple", new Price(100));
        Price result = apple.calcSubTotal(new Quantity(3));

        assertEquals(new Price(300), result);
    }
}
