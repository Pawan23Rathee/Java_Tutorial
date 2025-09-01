import java.util.*;
class H5{
    public static void main(String[] args){
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    public static void BubbleSort(int[] arr){
        int n  = arr.length;
        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                }

            }
        }
        
    }
}
