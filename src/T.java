import java.util.Random;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/21 22:27
 */
public class T {

    public static void main(String[] args) {
        System.out.println((new Random().nextInt() % 100) < 60 ? "YES" : "NO");
    }
}
