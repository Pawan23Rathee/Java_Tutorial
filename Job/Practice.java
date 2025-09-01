import java.util.*;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = isPalidrome(str);
        if(rev == "true"){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
    public static String isPalidrome(String str){
        for(int i = 0;i < str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length() -1 - i)){
                return "false";
            }
        }
        return "true";

}
}

