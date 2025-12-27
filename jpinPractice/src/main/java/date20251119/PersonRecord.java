package date20251119;

/**
 * 4つのフィールドを持っているクラス
 * コンストラクタとgetterは自動的に作られる
 * imutableであるためsetterは書かない
 *
 * @param name
 * @param age
 * @param height
 * @param weight
 */
public record PersonRecord(
        String name,
        int age,
        int height,
        int weight,
        Person.Event event) {
}
