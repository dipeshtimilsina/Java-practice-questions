import java.util.*;
public class ConsecutiveYes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        String input=scanner.nextLine();
        System.out.println(logic( input));
    }
    public static String logic(String input) {
        String ans="No";
        int ones=0;
        int zeros=0;
        String[] exploded = input.split("(?<=([01]))(?!\\1)");
        for(String string : exploded) {
            String s = String.valueOf(string.charAt(0));
            if(String.valueOf(string.charAt(0)).equals("0")){
                zeros+=1;
            }
            else{
                ones+=1;
            }
        }
        if(zeros%2==0 && ones%2==1){
            return "Yes";
        }else{
            return "No";
        }

    }
}