package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/22 22:01
 */
public class Solution04 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int cut1 = 0;
        int cut2 = 0;
        int cutL = 0;
        int cutR = n1;
        while (cut1 <= n1) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = (n1 + n2) / 2 - cut1;
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            double R1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            double R2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                cutR = cut1 - 1;
            } else if (L2 > R1) {
                cutL = cut1 + 1;
            }else {
                if ((n1 + n2) % 2 == 0) {
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 > R2 ? R2 : R1;
                    return (L1 + R1) / 2;
                }else {
                    return R1 < R2 ? R1 : R2;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
