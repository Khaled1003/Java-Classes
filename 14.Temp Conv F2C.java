import java.util.Scanner;

public class F2C {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        double F,C;

        System.out.print("Enter Fahrenheit to Convert: ");
        F = nput.nextDouble();

        C = 0.56*(F-32);
        System.out.println("C: "+C);
    }
}
