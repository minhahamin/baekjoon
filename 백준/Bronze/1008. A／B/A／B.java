import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        double result = (double) A / B;
        
        System.out.println(String.format("%.9f", result));
        
        scanner.close();
    }
}
