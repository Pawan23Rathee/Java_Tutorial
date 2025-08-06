
import java.util.Scanner;

class ThirdClass{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("You are not adult");
        }

    }
}