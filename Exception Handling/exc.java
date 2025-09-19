
import java.util.Scanner;

class exc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            if(age < 18){
            throw new Exception("Age must be at least 18");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            scanner.close(); // good practice
        }
    }
}