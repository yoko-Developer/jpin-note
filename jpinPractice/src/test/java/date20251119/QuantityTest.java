package date20251119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 最小は0個とする
 * 最大は99個とする
 * 数量を1増やすことができる
 * 数量を1減らすことができる
 * 増やせるかどうかを確認できる
 * 減らせるかどうかを確認できる
 * 小計を計算できる
 */
class QuantityTest {

    @Test
    public void 最小は0個とする() {
        assertThrows(IllegalArgumentException.class, () ->new Quantity(-1));
        assertDoesNotThrow(() -> new Quantity(0));
        assertEquals(0, new Quantity(0).intValue());
    }

    @Test
    public void 最大は99個とする() {
        assertThrows(IllegalArgumentException.class, () -> new Quantity(100));
        assertDoesNotThrow(() -> new Quantity(99));
        assertEquals(99,new Price(99).intValue());
    }

    @Test
    public void 数量を1増やすことができる() {
        Quantity q = new Quantity(0);
        Quantity q2 = q.increase();
        assertNotEquals(q, q2);
        assertEquals(1,q2.intValue());
    }

    @Test
    public void 数量を1減らすことができる() {
        Quantity q = new Quantity(1);
        Quantity q2 = q.decrease();
        assertNotEquals(q, q2);
        assertEquals(new Quantity(0), q2);
    }

    @Test
    public void 増やせるかどうかを確認できる() {
        Quantity q = new Quantity(98);
        assertTrue (q.canIncrease());

        Quantity q2 = new Quantity(99);
        assertFalse(q2.canIncrease());
    }

    @Test
    public void 減らせるかどうかを確認できる() {
        Quantity q = new Quantity(1);
        assertTrue(q.canDecrease());

        Quantity q2 = new Quantity(0);
        assertFalse(q2.canDecrease());
    }

    @Test
    public void 小計を計算することができる() {
        Price p = new Price(100);
        Quantity q = new Quantity(3);

        Price result = q.times(p);
        assertEquals(new Price(300), result);
    }
}
