import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        String Name;
        int a;
        float b;
        double c;

        System.out.print("Enter Your Name: ");
        Name = nput.nextLine();
        System.out.print("Enter any number: ");
        a = nput.nextInt();
        System.out.print("Enter a float number: ");
        b = nput.nextFloat();
        System.out.print("Enter a double number: ");
        c = nput.nextDouble();

        System.out.println("Your Name: "+Name);
        System.out.println("Your Integer Number: "+a);
        System.out.println("Your Float Number: "+b);
        System.out.println("Your Double Number: "+c);


    }
}
