import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();

        // 길이가 L인 수열을 만들어서 N의 합을 만족하는지 확인
        for (int length = L; length <= 100; length++) {
            int sum = (length * (length - 1)) / 2; // 등차수열의 합 공식 이용
            if ((N - sum) % length == 0 && (N - sum) / length >= 0) { // 등차수열의 첫 항이 음이 아니고, 정수인지 확인
                int start = (N - sum) / length;
                for (int i = 0; i < length; i++) {
                    System.out.print((start + i) + " ");
                }
                System.out.println();
                scanner.close();
                return;
            }
        }

        // 조건을 만족하는 수열이 없을 경우 -1 출력
        System.out.println(-1);

        scanner.close();
    }
}
