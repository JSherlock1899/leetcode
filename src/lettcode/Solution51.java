package lettcode;

import java.util.LinkedList;

/**
 * @author: sherlock
 * @description:
 * (a * b) % k = (a % k)(b % k) % k
 * @date: 2020/8/26 19:08
 */
public class Solution51 {

    public static void main(String[] args) {
        System.out.println(superPow(2, new int[]{1, 0}));
    }

    static int mod=1337;
    public static int superPow(int n,int[] nums){
        LinkedList<Integer> list = new LinkedList<>();
        for (int e:nums)
            list.add(e);
        return myPow(n,list);
    }

    private static int myPow(int n, LinkedList<Integer> list) {
        if (list.size()==0)
            return 1;
        Integer last = list.removeLast();
        n=n%mod;
        int part1=quickPow(n,last);
        int part2=quickPow(myPow(n,list),10);
        return (part1*part2)%mod;
    }

    private static int quickPow(int n, Integer k) {
        int res=1;
        int temp=n%mod;
        while (k>0){
            if ((k &1) ==1 ){
                res=(res*temp)%mod;
            }
            temp=(temp*temp)%mod;
            k=k>>1;
        }
        return res%mod;
    }


}
