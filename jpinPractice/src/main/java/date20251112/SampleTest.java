package date20251112;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    public void testPlus() {
        Sample s = new Sample();
        int result = s.plus(2, 3);
        // 1つ目の引数：期待値 2つ目の引数：待ってたよー
        assertEquals(5, result);
    }

    @Test
    public void testMinus() {
        Sample s = new Sample();
        int result = s.Minus(5, 3);
        assertEquals(2, result);
    }
}
