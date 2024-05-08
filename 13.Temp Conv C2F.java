import java.util.Scanner;

public class C2F {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);
        double C, F;

        System.out.print("Enter Celsius To Convert: ");
        C = nput.nextDouble();

        F = 1.8*C+32; // "9/5=1.8"
        System.out.println("F: "+F);
    }
}
