//Area of a Triangle
import java.util.Scanner;

public class AreaOfaTriangle {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        double Base, Height, Area;

        System.out.print("Type Base Length: ");
        Base = nput.nextDouble();
        System.out.print("Type Height Length: ");
        Height = nput.nextDouble();

        Area = 0.5*Base*Height;
        System.out.println("Area: "+Area);
    }
}
