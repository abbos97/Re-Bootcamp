package Code.Loop.Do_While_loop.day2;

import java.util.Scanner;

public class Test_Do_While {
    public static void main(String[] args) {
        int data;
        int sum=0;
        //Create a Scanner
        Scanner scan=new Scanner(System.in);
        //Keep  reading data until the scan is 0
        do{
            //road the next
            System.out.println(
                    "Enter an integer ( the scan ends if it is 0): ");
            data=scan.nextInt();
            sum+=data;
        }while (data !=0);
        System.out.println("The sum is "+sum);


    }
}
