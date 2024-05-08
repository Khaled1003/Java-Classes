// Finding Out The Monthly Installment of a phone which price is $1800.00
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        int PhonePrice = 1800;
        int numberOfInstallment, installmentPerMonth;

        System.out.print("Number of Installments: ");
        numberOfInstallment = nput.nextInt();

        installmentPerMonth = 1800/numberOfInstallment;
        System.out.println("Your monthly installment is: "+installmentPerMonth + "$"); // we have to use '+' sign to add another print ("") in the line
        //**or** System.out.println(("Your monthly installment is: $"+installmentPerMonth);
    }
}
