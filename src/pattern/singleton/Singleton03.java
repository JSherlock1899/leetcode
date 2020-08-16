package pattern.singleton;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/28 23:15
 */
public class Singleton03 {
    public static final Singleton03 INSTANCE;
    private String info;

    static {
        INSTANCE = new Singleton03("info");
    }

    private Singleton03(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton03{" +
                "info='" + info + '\'' +
                '}';
    }
}
