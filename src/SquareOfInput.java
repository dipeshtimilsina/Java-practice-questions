import java.util.Scanner;
import java.lang.Math;
public class SquareOfInput {
    public static void main (String[] args){
        System.out.println("Enter the input");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double square= Math.pow(a,2);
        System.out.println(square);
    }
}
