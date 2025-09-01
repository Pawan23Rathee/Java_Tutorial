import java.util.*;
class H4{
    public static void main(String[] args){
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        int result = findSecondSmall(arr);
        System.out.println("Second smallest value: " + result);
    }

    public static int findSecondSmall(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                secondsmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondsmall && arr[i] != small){
                secondsmall = arr[i];
            }
        }
        return (secondsmall == Integer.MAX_VALUE) ? -1 : secondsmall;
    }
}   