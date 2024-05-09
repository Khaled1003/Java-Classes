import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        int age;
        System.out.print("Please Enter Your Age: ");
        age = nput.nextInt();

        if (age>=18){
            System.out.println("Valid for vote");
        }
        else {
            System.out.println("Invalid to vote");
        }
    }
}
