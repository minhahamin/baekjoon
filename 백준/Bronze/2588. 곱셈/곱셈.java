import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 세 자리 자연수 입력 받기
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 곱셈 결과 계산
        int result1 = num1 * (num2 % 10); // (3)
        int result2 = num1 * ((num2 / 10) % 10); // (4)
        int result3 = num1 * (num2 / 100); // (5)
        int finalResult = num1 * num2; // (6)

        // 결과 출력
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);
    }
}
