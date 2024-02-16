import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 개의 정수를 입력 받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // (A+B)%C
        int result1 = (A + B) % C;
        // ((A%C) + (B%C))%C
        int result2 = ((A % C) + (B % C)) % C;
        // (A×B)%C
        int result3 = (A * B) % C;
        // ((A%C) × (B%C))%C
        int result4 = ((A % C) * (B % C)) % C;

        // 결과 출력
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        scanner.close();
    }
}
