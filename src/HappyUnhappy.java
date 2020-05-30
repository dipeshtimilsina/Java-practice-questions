/* A is unhappy if the digit to its left and the digit
* to its right are both 0s. A 0 is unhappy if the digit to its left and the digit to its right are both 1s.
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
        if(input.length()==1){ //Checking if the input is only one digit. If so, return nothing.
            return 0;
        }else if(input.length()==2){   //if input is just 2 digits, if both are same, we return 2 else 0
            if(input.charAt(0) == input.charAt(1)){
                return 2;
            }
            else{
                return 0;
            }

        }else{
            if(input.charAt(0) == input.charAt(1)){ //for the first 2 and the last two digits who have only one neighbour
                                                    //if both are same, we add one up, else it is zero
                ans+=1;
            }
            if(input.charAt(input.length()-1) == input.charAt(input.length()-2)){  //this one is for the last two
                ans+=1;
            }
            for (int i = 1; i < input.length()-1; i++) {
                if(!(input.charAt(i) != input.charAt(i-1) && input.charAt(i) != input.charAt(i+1))){ //if both the left
                                                            //and the right to i are not equal, then we add 1 to ans
                    ans+=1;
                }
            }
        }

        return ans;
    }
}
