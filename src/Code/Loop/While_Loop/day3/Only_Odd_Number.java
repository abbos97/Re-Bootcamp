package Code.Loop.While_Loop.day3;

public class Only_Odd_Number {
    public static void main(String[] args) {
        int x = 100;


        while (x > 0) {
            // if x divided by 2 have remainder
            // for example 5/2=2 1 remain   5%2=1  1!=0
            if (x % 2 != 0) { // x % 2 == 1 does same thing
                System.out.println(x + " is odd number");
            }

            --x;
        }
    }
}