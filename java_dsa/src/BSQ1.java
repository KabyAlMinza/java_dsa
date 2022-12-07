// floor and ceiling
public class BSQ1 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int arr[], int target ){
        int min = 0;
        int max = arr.length-1;
        while (min<=max){
            int mid = min + (max-min)/2;

            if (target<arr[mid]){
                max = mid-1;
            }
            else if (target > arr[mid]){
                min = mid+1;
            }
            else{
                return mid;
            }
        }
    return arr[min];
    }
}
