public class RainWater {
    public static void main(String[] args){
        int[] arr = {4,1,0,3,5};
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right){
            if(arr[left] < arr[right]){
                if(arr[left] >= leftMax){
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if(arr[right] >= rightMax){
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        System.out.println("Total water trapped: " + water);
    }
}