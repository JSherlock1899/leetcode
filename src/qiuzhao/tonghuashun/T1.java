package qiuzhao.tonghuashun;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 11:21
 */
public class T1 {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int sum=0;
        while(num>9){
            sum+=num%10;
            num/=10;
        }
        sum+=num;
        if(sum<10){
            return sum;
        }else{
            return addDigits(sum);
        }
    }
}
