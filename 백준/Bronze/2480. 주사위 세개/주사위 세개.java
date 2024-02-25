import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = scanner.nextInt();
        }
        
        Arrays.sort(dice);
        
        int prize = 0;
        if (dice[0] == dice[2]) { // 같은 눈이 3개가 나오는 경우
            prize = 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) { // 같은 눈이 2개가 나오는 경우
            prize = 1000 + dice[1] * 100;
        } else { // 모두 다른 눈이 나오는 경우
            prize = dice[2] * 100;
        }
        
        System.out.println(prize);
        
        scanner.close();
    }
}
