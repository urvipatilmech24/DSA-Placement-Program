public class MedianArray {
    public static double MedianArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0,j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }while(i < m){
            merged[k++] = nums1[i++];
        }while(j < n){
            merged[k++] = nums2[j++];
        }
        int totalLength = m+n;
        if(totalLength % 2 == 0){
            return (merged[totalLength/2 - 1] + merged[totalLength/2])/2.0;
        }else{
            return merged[totalLength/2];
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,3,5,8};
        int[] nums2 = {2,4,6,7};
        double median = MedianArrays(nums1, nums2);
        System.out.println("Median: "+ median);
    }
}
  
