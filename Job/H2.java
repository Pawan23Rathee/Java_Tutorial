import java.util.*;

class H2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result = findMin(arr);
        System.out.println("Minimum value: " + result);
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];  
            }
        }
        return min;
    }
}