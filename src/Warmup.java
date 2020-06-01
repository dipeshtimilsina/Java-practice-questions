import java.util.Scanner;
public class Warmup {
    public static void main(String[] args) {
        String input;
        Scanner scanner= new Scanner(System.in);
        input= scanner.nextLine();
        System.out.println(logic(input));
    }

    public static String logic(String input){
        input= input.toLowerCase();
        String ans= " ";
        for (int i=0;i<input.length();i++){
           String l= String.valueOf(input.charAt(i));
           if (l.equals("i")|| l.equals("e")|| l.equals("i")||l.equals("o")|| l.equals("u")|| l.equals(" ")){
               ans+= l;
            }
           else
               ans+= l.toUpperCase();
        }
        return ans;
    }
}
