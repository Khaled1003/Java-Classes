import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        int i;
        System.out.print("Enter Any Number: ");
        i = nput.nextInt();

        if (i>0) {
            System.out.printf("%d is greater than 0",i);
        } else if (i<0) {
            System.out.printf("%d is less than 0",i);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
