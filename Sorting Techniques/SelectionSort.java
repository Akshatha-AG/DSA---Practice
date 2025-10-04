public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {6,2,15,0,1,4,7,10};
        int n=arr.length - 1;
        //selection sort
        
        for(int i=0; i<arr.length; i++){
            int max=0;
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[max]){
                    max = j;
                    
                }
            }
            //swap
            int temp = arr[n];
            arr[n]=arr[max];
            arr[max] = temp;
            n--;
            
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}