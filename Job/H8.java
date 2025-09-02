import java.util.*;
class H8{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt(); // search element

        int result = BinarySearch(arr, key);

        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int BinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (low + high)/2;

            if(arr[mid] == key){
                return mid;
            }else if (arr[mid] < key) {
                low = mid + 1;
            
                
            }else{
                high = mid - 1;
            }

        }
        return -1;
    }
}