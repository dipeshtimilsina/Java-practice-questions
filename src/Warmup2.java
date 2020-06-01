import java.util.Scanner;

public class HappyUnhappy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input;
        System.out.print("Input:");
        input = scanner.nextLine();
        System.out.println(logic(input));

    }