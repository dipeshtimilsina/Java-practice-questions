import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input;
        System.out.print("Input:");
        input = scanner.nextLine();
        System.out.println(logic(input));

    }
    public static int logic (String input){
    int ans=0;
    if (input.length()==1){
        return 0;
    }
    else if (input.length()==2){
        if (input.charAt(0)==input.charAt(1)){
            return 2;
        }
        else
            return 0;
    }

    else{
        if (input.charAt(0)==input.charAt(1)){
            ans+=1;
        }
        if (input.charAt(input.length()-1)==input.charAt(input.length()-2)){
            ans+=1;
        }
        for (int i=1;i<input.length()-1;i++){
            if (!(input.charAt(i)!=input.charAt(i+1) && input.charAt(i)!= input.charAt(i-1)))
                ans+=1;
        }
    }

    return ans;
    }
}