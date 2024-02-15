import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 불기 연도 입력 받기
        int buddhistYear = scanner.nextInt();

        // 서기 연도로 변환
        int adYear = buddhistYear - 543;

        // 결과 출력
        System.out.println(adYear);

        scanner.close();
    }
}
