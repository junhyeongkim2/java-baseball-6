package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        validateIsThreeNumber(input);
        return input;
    }

    public static String readRetryNumber() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }


    public static void validateIsThreeNumber(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 잘못된 입력이 주어졌습니다. 게임을 종료합니다.");
        }
    }


}
