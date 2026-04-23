package twoPoints;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b88MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int dem2=0;
        for(int i=0;i<m+n;i++){
            if(nums1[i]==0&&dem2<n){
                nums1[i]=nums2[dem2];
                dem2++;

            }
        }
        Arrays.sort(nums1);

    }

}
class Solutionb88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}