import java.util.*;
class H7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int key = sc.nextInt();  // search element
        
        int result = linearSearch(arr, key);
        
        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int linearSearch(int[] arr,int key){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == key)
                return i;
            }
            return -1;
        }
        


    }

    