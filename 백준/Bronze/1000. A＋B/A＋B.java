import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 A와 B를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A와 B를 더한 결과를 출력
        System.out.println(A + B);

        // 스캐너를 닫음
        scanner.close();
    }
}
