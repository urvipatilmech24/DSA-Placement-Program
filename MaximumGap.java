import java.util.*;
public class MaximumGap {
    /*public static int maximumGap(int[] nums){
        Arrays.sort(nums);
        int[] gaps = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++){
            gaps[i] = nums[i + 1] - nums[i];
        }
        int maxGap = gaps[0];
        for(int i = 1; i < gaps.length; i++){
            if(gaps[i] > maxGap){
                maxGap = gaps[i];
            }
        }
        return maxGap;
    }*/
   public static int maximumGap(int[] nums){
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i = 1; i < nums.length; i++){
            int gap = nums[i] - nums[i - 1];
            if(gap > maxGap){
                maxGap = gap;
            }
        }
        return maxGap;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int maxGap = maximumGap(nums);
        System.out.println("Maximum Gap: "+ maxGap);
    }
}
