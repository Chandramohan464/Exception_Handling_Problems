import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numerator=sc.nextInt();
        System.out.println("Enter the second number: ");
        int denominator=sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
