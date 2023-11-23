import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Up & Down 게임을 시작합니다! 1부터 100 사이의 숫자를 맞춰보세요.");

        int userGuess;
        do {
            System.out.print("숫자를 입력하세요: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Up! 더 큰 숫자를 입력하세요.");
            } else if (userGuess > randomNumber) {
                System.out.println("Down! 더 작은 숫자를 입력하세요.");
            } else {
                System.out.println("축하합니다! 정답입니다.");
            }

        } while (userGuess != randomNumber);

    }
}
