package Code.Loop.While_Loop.day3;

public class OnlyEvenNumber {
    public static void main(String[] args) {
        //write a program to print out even number from 0 to 50;
        // write a program to print a odd number from 0 to 50;
        int x=100;
        while (x>0){
            if(x %2 ==0){
                System.out.println(x+" is even number");
            }
            --x;
        }
    }
}
