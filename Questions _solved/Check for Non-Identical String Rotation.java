public class QuickSort{
    public static void main(String[] args) {
        System.out.println(isRotation("abcde","eabcd" ));
    }

public static boolean isRotation(String s1, String s2) {
    // Write your code here
    
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()== 1 && s2.length() == 1){
            return false;
        }
        if(s1.equals(s2)){
            return false;
        }
        String combined = s1+s1;
        //boolean result = false;
        
        if(combined.contains(s2)){
            return true;
        }
        return false;
    
    }
}
