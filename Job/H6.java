import java.util.*;
class H6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        shorting(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }



    }

    public static void shorting(int[] arr){
        int n  = arr.length;
        for(int i = 0; i < n - 1; i++){
            int iMin = i;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[iMin]){
                    iMin = j;
                }
            }
            int temp = arr[iMin];
            arr[iMin] = arr[i];
            arr[i] = temp;
            
            
        }
    }
}