package pattern.singleton;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/28 23:30
 */
public class Singleton05 {

    private volatile static Singleton05 INSTANCE;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        //主要为了性能
        if (INSTANCE != null) {
            synchronized (Singleton05.class) {
                //判断此时的单例是否为空
                if (INSTANCE != null) {
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }
}
