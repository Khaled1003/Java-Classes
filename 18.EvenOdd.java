import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        int n;
        System.out.print("Enter Any Positive Number: ");
        n = nput.nextInt();

        if (n%2==0){ //The formula of Even Odd is "n%2==0" if the reminder is 0 then it's an even number.
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
