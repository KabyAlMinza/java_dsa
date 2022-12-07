// first and last index of a number
public class BSQ2 {
    public static void main(String[] args) {
        
    }
    static int leftBinSearch(int nums[], int target, boolean start ){
        int ans[] = {-1,-1};
        int min = 0;
        int max = nums.length-1;
        while (min<=max){
            int mid = min + (max-min)/2;

            if (target<nums[mid]){
                max = mid-1;
            }
            else if (target > nums[mid]){
                min = mid+1;
            }
            else{
                return mid;
            }
        }
    return ans;
    }
   
}
