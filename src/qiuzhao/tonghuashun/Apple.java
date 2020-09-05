package qiuzhao.tonghuashun;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 10:15
 */
public class Apple extends T{

    static {
        System.out.println("x");
    }
    {
        System.out.println("y");
    }

    public Apple() {
        System.out.println("z");
    }

    public static void main(String[] args) {
        T apple = new Apple();
    }
}
