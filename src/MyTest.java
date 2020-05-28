import java.util.Scanner;

public class MyTest {

    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        //Print output returned from the logic function
        System.out.println(logic(input));
    }


    //The function is expected to return a String.
    //The function accepts String as parameter.
    public static String logic(String input){
        //Write your code here
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
        input= input.toLowerCase();
        String ans= "";
        for (int i=0;i<input.length();i++){
            String l= String.valueOf(input.charAt(i));
            if (l.equals("i") || l.equals("e")||l.equals("i")||l.equals("o")||l.equals("u")){
                ans+=l;
            }
            else if (l.equals(" ")){
                ans+=l;
            }
            else{
                ans+=l.toUpperCase();
            }
        }
        return ans;

    }
}