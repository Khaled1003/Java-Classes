import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        int ID;
        int Price;
        String Title;
        String Description;
        String Category;

        System.out.print("Please Type Product ID: ");
        ID= nput.nextInt();
        System.out.print("Put Price: ");
        Price = nput.nextInt();
        System.out.print("Title: ");
        Title = nput.nextLine();
        System.out.print("Description: ");
        Description = nput.nextLine();
        System.out.print("Category: ");
        Category = nput.nextLine();

        System.out.println("Your Product ID: "+ID);
        System.out.println("Your Price: "+Price);
        System.out.println("Your Title: "+Title);
        System.out.println("Your Description: "+Description);
        System.out.println("Your Category: "+Category);


    }
}
