import java.util.*;

public class linearSearch{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println(LinearSearch(nums, 50));
    }

    public static int LinearSearch(List<Integer> nums, int target) {
    // Write your code here
    
        int result = -1;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == target){
                result = i;
            }
        }
        return result;
    }
     
}
