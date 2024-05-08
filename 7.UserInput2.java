import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {

        Scanner nput = new Scanner(System.in);

        String name;
        System.out.print(" Write your name: ");
        name = nput.nextLine(); // if use "nput.next()" instead of  "nextLine()" the Only 1st name will just appear.

        System.out.println("Welcome: "+name);

    }
}

