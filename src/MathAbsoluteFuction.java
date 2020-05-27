import java.util.Scanner;
public class MathAbsoluteFuction {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt();

        int b= Math.abs(a-10);
        System.out.println(b);
    }
}
