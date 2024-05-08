public class IncreamentDecreament {
    public static void main(String[] args) {
        int x,y;

        x=10;

        y=++x; // x=11
        System.out.println("y = "+y);

        y=x++;//x=11
        System.out.println("y = "+y);

        y=--x;//x=12-1=11
        System.out.println("y = "+y);

        y=x--;//x=11
        System.out.println("y = "+y);

        y=++x;//x=10+1=11
        System.out.println("y = "+y);
    }
}
