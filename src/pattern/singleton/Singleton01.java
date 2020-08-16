package pattern.singleton;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/28 23:10
 */
public class Singleton01 {

    public static final Singleton01 INSTANCE = new Singleton01();
    private Singleton01() {
    }
}
