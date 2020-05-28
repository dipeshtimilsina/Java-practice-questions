/* A is unhappy if the digit to its left and the digit
* to its right are both 0s. A 0 is unhappy if the digit to its left and the difit to its right are both 1s.
* If a number has only one neighbour, it is unhappy
* if its only neighbor is different. Otherwise it is
* happy. If a number doesn't have any neighbor, it is unhappy.
* Write a program that takes a string as an input consisting
* only of 1s and 0s and returns the count of happy numbers.
*
* Example: Input> 0110 || Output> 2*/
import java.util.Scanner;

public class HappyUnhappy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input;
        System.out.print("Input:");
        input = scanner.nextLine();
        System.out.println(logic(input));

    }

    private static int logic(String input) {
        int ans=0;
        if(input.length()==1){
            return 0;
        }else if(input.length()==2){
            if(input.charAt(0) == input.charAt(1)){
                return 2;
            }
            else{
                return 0;
            }

        }else{
            if(input.charAt(0) == input.charAt(1)){
                ans+=1;
            }
            if(input.charAt(input.length()-1) == input.charAt(input.length()-2)){
                ans+=1;
            }
            for (int i = 1; i < input.length()-1; i++) {
                if(!(input.charAt(i) == input.charAt(i-1) && input.charAt(i) == input.charAt(i+1))){
                    ans+=1;
                }
            }
        }

        return ans;
    }
}
