package Code.Loop.While_Loop.day2;

public class CountFrom10To1 {
    public static void main(String[] args) {
        // I want to start with 10 , then decrease the value by one
        // so I can get out of the loop
        int count = 10;

//        while ( count >= 1  ) {
//
//            System.out.println( count );
//            -- count ;
//        }
        while (count != 0) {

            System.out.println(count);
            --count;

        }

        System.out.println("final value of count " + count);


        System.out.println("--------------------");

        int cnt=20;
        while (cnt!=0){
            System.out.println("Count down 20 to 1 : " + cnt);
            --cnt;
        }
    }
}
