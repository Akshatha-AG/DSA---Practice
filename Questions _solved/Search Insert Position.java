
public class Practice{
    public static void main(String[] args) {
     
      int arr[] = {1,3,4};
      int target = 5;
      searchInsert(arr, target);
    }

    public static void searchInsert(int arr[], int target){
      //Search Insert Position

      int low = 0;
      int high = arr.length-1;

      while (low <= high){
        int mid = low + (high - low) / 2;
        
        if(arr[mid] == target){
          System.out.println(mid);
        }else if(arr[mid] < target){
          low = mid + 1;
        }else{
          high = mid - 1;
        }
      }
      System.out.println(low);
    }
}

