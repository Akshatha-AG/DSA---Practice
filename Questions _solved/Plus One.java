public class Practice{
    public static void main(String[] args) {
	//Plus One
     
     int arr[] = {9,9,1};
     int newArr[]= plusone(arr);
     for(int i: newArr){
      System.out.println(i);
     }
    }
    public static int[] plusone(int[] digits){
      for(int i=digits.length-1; i>=0; i--){
        if(digits[i] < 9){
          digits[i]++;
          return digits;
        }
        digits[i] = 0;
      }

      int res[] = new int[digits.length+1];
      res[0]=1;
      return res;
    }
}