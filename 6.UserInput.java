// How to get user input

import java.util.Scanner; // You need to use this line in under package and top of Public Class

public class UserInput {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in); //That how we call Scanner class and we're using "System.in" only bcz we are taking input from the user
        int number;

        System.out.print("Enter any Number: ");
        number = n.nextInt(); // In this line "n.nextInt" "n" is the name of the variable that we took after declaring "Scanner" 8th line.

        System.out.println("Number = "+number);
    }
}
