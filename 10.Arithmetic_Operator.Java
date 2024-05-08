import java.util.Scanner;
public class Arithmetic_Operator {
    public static void main(String[] args) {
         Scanner nput = new Scanner(System.in);


         float n1, n2, result;

         System.out.print("Type two numbers:\nnum1:");
         n1 = nput.nextInt();
         System.out.print("num2:");
         n2 = nput.nextInt();

         result = n1+n2;
         System.out.println("\nSUM = "+result);

         result = n1-n2;
         System.out.println("Sub = "+result);

         result = n1*n2;
         System.out.println("Multiplication = "+result);

         result = n1/n2;
         System.out.println("Div = "+result);

         result = n1%n2;
         System.out.println("Reminder = "+result);

         result = (n1+n2)/2;
         System.out.println("Avg = "+result);

    }
}
