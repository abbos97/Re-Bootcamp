package Code.Loop.While_Loop.day2;

import java.util.Scanner;

public class String_Practice_GoogleSearch {
    /*
        *
        *
        Create a program to ask user to
        enter a String with any number of word
        Create a variable called searchKeyword to save user input
        Create another String variable called tabTitle
        assign tabTitle value to searchKeyword +  "- Google Search"
        Check if tabTitle start with your searchKeyword
        and end with - Google Search
        If so print the test has passed , if not print test has failed
        (Assume you don't know tab title is already correct
        in real world , we will capture it with automation)
        * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword to search ");
        String searchKeyword=scan.nextLine();//"Java";
        String tabTitle= searchKeyword+ "- Google Search";

        if( tabTitle.startsWith( searchKeyword) && tabTitle.endsWith("- Google Search")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
