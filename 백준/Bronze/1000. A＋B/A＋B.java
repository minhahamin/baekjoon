import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 A와 B를 입력 받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // A와 B의 합을 계산
        int sum = A + B;
        
        // 결과 출력
        System.out.println(sum);
    }
}
