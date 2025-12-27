package date20251119;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    private List<PersonRecord> history= new ArrayList<>();

    public Person(String name, int age, int height, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        this.save(Event.BIRTH);

        this.history.add(new PersonRecord(name, age, height, weight, Event.INIT));
    }

    private void save(Event event) {
        this.history.add(new PersonRecord(name, age, height, weight, event));

    }

    public int birthday() {
        this.age++;
//        this.height++; // bug
        return this.age;
    }

    public enum Event {
        INIT, BIRTH
    }

    public List<PersonRecord> getHistory() {
        // 書き換えられないようにコピーを戻す
        // フィールドを戻すのは危険
        return List.copyOf(this.history);
    }
}
