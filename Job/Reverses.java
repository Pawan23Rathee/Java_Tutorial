
import java.util.*;

class Reverses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] arr = {3, 5, 7, 2, 8};

        int findmax = arrayFindMax(arr);
        System.out.println("Maximum value in array: " + findmax);

        String rev = reverseString(str);
        System.out.println("Reversed string: " + rev);

        String palinCheck = PalindromCheck(str);
        System.out.println(palinCheck);

        int findmin = Findmini(arr);
        System.out.println("Minimum value in array: " + findmin);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int arrayFindMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static String PalindromCheck(String str){
        String revs = new StringBuilder(str).reverse().toString();
        if(str.equals(revs)){
            return "Palindrome";
        }
        else{
            return "Not a Palindrome";
        }

    }

    public static int Findmini(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}