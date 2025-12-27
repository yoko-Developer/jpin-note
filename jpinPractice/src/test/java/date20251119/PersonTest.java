package date20251119;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    /**
     * 不変条件と副作用を一度にテストする
     */
    @Test
    public void testA() {

        Person p = new Person("sample", 20, 170, 60);
        List<PersonRecord> history = p.getHistory();

        assertEquals(1, history.size()); // 1件だけであることを確認
        PersonRecord expect = new PersonRecord("sample", 20, 170, 60, Person.Event.INIT);
        assertEquals(expect, history.getFirst());
    }

    /**
     * 事後条件のテスト(どんな処理をしなければならないかのテスト)
     * 不変条件が正しく保たれているか
     */
    @Test
    public void BirthdayTest() {

        Person p = new Person("sample", 20, 170, 60);
        List<PersonRecord> history = p.getHistory();
        assertEquals(2, history.size());

        int result = p.birthday();
        assertEquals(21, result);

        List<PersonRecord> history2 = p.getHistory();
        assertEquals(2, history2.size());

        PersonRecord expect = new PersonRecord("sample", 21, 170, 60, Person.Event.BIRTH);
        assertEquals(expect, history2.getLast());

        int result2 = p.birthday();

        List<PersonRecord> history3 = p.getHistory();
        assertEquals(3, history.size());

        PersonRecord expect2 = new PersonRecord("sample", 22, 170, 60, Person.Event.BIRTH);
        assertEquals(expect2, history3.getLast());
    }

}
