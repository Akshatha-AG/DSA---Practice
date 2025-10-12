import java.util.*;
import java.util.regex.*;

public class Max_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String sentance = sc.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(sentance);

        ArrayList<Integer> arr = new ArrayList<>();

        while(m.find()){
            arr.add(Integer.parseInt(m.group()));
        }

        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println("Maximum Number from String: "+Collections.max(arr));
        System.out.println("Sum of Numbers from String: "+ sum);
    }
}