package baseball.view;

import java.util.List;

public class OutputView {


    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(List<Integer> result) {

        if (result.get(1) != 0) {
            System.out.print(result.get(1) + "볼");
        }

        if (result.get(0) != 0) {
            System.out.print(result.get(0) + "스트라이크 ");
        }

        if (result.get(0) == 0 && result.get(1) == 0) {
            System.out.print("낫싱");
        }

        System.out.println();

    }


}
