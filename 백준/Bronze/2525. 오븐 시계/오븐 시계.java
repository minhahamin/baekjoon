import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시각 입력 받기
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        // 요리하는 데 필요한 시간 입력 받기
        int cookingTime = scanner.nextInt();

        // 분 단위로 계산된 총 소요 시간
        int totalMinutes = currentHour * 60 + currentMinute + cookingTime;

        // 계산된 총 소요 시간을 시간과 분으로 변환
        int endHour = (totalMinutes / 60) % 24;
        int endMinute = totalMinutes % 60;

        // 결과 출력
        System.out.println(endHour + " " + endMinute);

        scanner.close();
    }
}
