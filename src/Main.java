/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/7 20:45
 */
public class Main {
    //1
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String in = sc.nextLine();
//        String[] ins = in.split(" ");
//        Long n = Long.valueOf(ins[0]);
//        Long m = Long.valueOf(ins[1]);
//        System.out.println(n / 2 / m * m * m);
//    }
    //2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int res = 0;
//        int count = 1;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (count % 2 == 0) {
//                res -= arr[i];
//            } else {
//                res += arr[i];
//            }
//            count++;
//        }
//        System.out.println(res);
//    }
    //3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int low = 1;
//        int high = m;
//        while (low < high) {
//            int mid = (low + high + 1) >> 1;
//            int sum = need(mid, n);
//            if (sum > m) {
//                high = mid - 1;
//            } else if (sum == m) {
//                low = mid;
//                break;
//            } else {
//                low = mid;
//            }
//        }
//        System.out.println(low);
//    }
//
//    private static int need(int mid, int n) {
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += mid;
//            mid = (mid + 1) >> 1; }
//        return sum;
//    }
    //4

}
