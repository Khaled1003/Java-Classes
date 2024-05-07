import java.util.SplittableRandom;

public class Printf {
    public static void main(String[]args){
        int a = 10;
        float f = 10.5F;
        double d = 10.560;
        char c = 'a';

        System.out.printf("Value of a = %d\n",a);
        System.out.printf("Value of float is = %.2f\n",f);
        System.out.printf("Value of double is = %.2f\n",d);
        System.out.printf("Value of character is = %c\n",c);
    }
}
