import java.util.Scanner;

public class Vowel_Constant {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);

        char ch;
        System.out.print("Enter any letter: ");
        ch = nput.next().charAt(0);

        if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Constant");
        }
    }
}
