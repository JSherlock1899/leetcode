package pattern.singleton;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/28 23:23
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04() {
    }

    public static Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }
}
