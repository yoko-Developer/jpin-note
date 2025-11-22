package date20251112;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    public void testPllus() {
        Sample s = new Sample();
        int result = s.plus(2, 3);
        assertEquals(5, result); // 期待値, 結果
    }

    @Test
    public void testMinus() {
        Sample s = new Sample();
        int result = s.minus(5, 3);
        assertEquals(2, result);
    }

}
