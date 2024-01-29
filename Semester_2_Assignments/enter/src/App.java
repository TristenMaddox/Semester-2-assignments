import java.util.Scanner;

public class App{

    public static void main(String[]args)throws Exception {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstnumber = input.nextInt();
        System.out.println("Enter another number:");
        int secondNumber = 0;

        int quotient = 0;

        try {
            quotient = firstnumber / secondNumber;
        } catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("Default answer of 0 used for quotent");
        } finally{
            System.out.println(String.format("The answer from division is %s", quotient));
        }
        input.close();
    }
}