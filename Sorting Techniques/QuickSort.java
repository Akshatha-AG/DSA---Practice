public class QuickSort{

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,7,10,17};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}