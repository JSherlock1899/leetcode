/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 10:35
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(12 & ~ -12); //8
        System.out.println(12 & (12 - 1)); //8
        System.out.println(12 & -12);
    }
}
