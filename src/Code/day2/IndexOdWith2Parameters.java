package Code.day2;

public class IndexOdWith2Parameters {
    public static void main(String[] args) {
        //           012345678901234567890123456789012
        //String name="I love Java I love Java Java Java";

        //get the second java from the sentence
        //assume you already know there is 4 JAva in this sentences
        //second java means -> the showed up after first JAva

        // first find out where is location of the first Java showed up
        // in order to find second one ,
        // instead of searching from beginning,
        // search from right after the location you found first Java
        // then it will give give you the index of second java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        // indexOf method has 2 version 1 expect 1 external data
        // another expect 2 external data -->> yourString.indexOf()

        //           012345678901234567890123456789012
        String name="I love Java I love Java Java Java";

        System.out.println("Java starting from 0 " + name.indexOf("Java"));
        System.out.println("Java starting from 7 " + name.indexOf("Java", 7));
        System.out.println("Java starting from 8 " + name.indexOf("Java", 8));
        System.out.println("Java starting from 9 " + name.indexOf("Java", 9));
        System.out.println("Java starting from 19 " + name.indexOf("Java", 19));
        System.out.println("Java starting from 20 " + name.indexOf("Java", 20));

        // How do i start from the location that get past first Java
        // basically starting point different that 0 so that It get past first Java
    }
}
