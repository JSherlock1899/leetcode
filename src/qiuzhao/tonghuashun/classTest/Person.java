package qiuzhao.tonghuashun.classTest;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 12:04
 */
public class Person {
    static {
        System.out.println("qiuzhao.tonghuashun.classTest.Person：静态代码块");
    }
    {
        System.out.println("qiuzhao.tonghuashun.classTest.Person：动态代码块");
    }
    public Person(){
        System.out.println("qiuzhao.tonghuashun.classTest.Person：构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
    }
}
