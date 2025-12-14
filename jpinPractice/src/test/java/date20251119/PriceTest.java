package date20251119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * テストから作る
 * マイナスの価格は持てない
 * 上限は10万円未満とする
 * 価格同士が足し算できなければならない
 * 価格同士が引き算できなければならない
 * nullとは足し算と引き算はできない
 * 足し算した結果上限を超えてはならない
 * 引き算をした結果加減を下回ってはならない
 * 数量と掛け算ができる(小計を出すため)
 */
public class PriceTest {

    @Test
    public void マイナスの価格は持てない() {

        // このコンストラクタにマイナスの値を与えるとエラーが返ってくるかをテストする
        // Price p = new Price();

        // 例外が起こる引数を渡す
        assertThrows(IllegalArgumentException.class, () -> new Price(-1));
        assertDoesNotThrow(() -> new Price(0));
        assertEquals(0, new Price(0).intValue());
    }

    @Test
    public void 上限は10万円未満とする() {
        assertDoesNotThrow(() -> new Price(99999));
        assertEquals(999999, new Price(999999).intValue());
        assertThrows(IllegalArgumentException.class, () -> new Price(1000000));
    }

    @Test
    public void 価格同士が足し算できなければならない() {
        Price a = new Price(2);
        Price b = new Price(3);
        Price result = a.plus(b);
        assertEquals(5, result.intValue());
    }

    @Test
    public void 価格同士が引き算できなければならない() {
        Price a = new Price(5);
        Price b = new Price(3);
        Price result = a.minus(b);
        assertEquals(2, result.intValue());

    }

    @Test
    public void nullとは足し算と引き算はできない() {
        Price a = new Price(3);
        assertThrows(IllegalArgumentException.class, () -> a.plus(null));
        assertThrows(IllegalArgumentException.class, () -> a.minus(null));
    }

    @Test
    public void 足し算した結果上限を超えてはならない() {
        Price a = new Price(999999);
        Price b = new Price(1);
        assertThrows(OutOfRangeException.class, () -> a.plus(b));
    }

    @Test
    public void 引き算した結果加減を下回ってはならない() {
        Price a = new Price(0);
        Price b = new Price(1);
        assertThrows(OutOfRangeException.class, () -> a.minus(b));
    }

    @Test
    public void 数量と掛け算ができる() {
        Price p = new Price(100);
        Quantity q = new Quantity(3);

        Price result = p.multi(q);
        assertEquals(new Price(300), result);
    }
}
