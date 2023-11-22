package baseball.controller;

import baseball.model.Computer;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGameController {

    private Computer computer;

    public void start() {
        computer = new Computer();
        computer.createNumbers();
        OutputView.printStartMessage();
        repeatGame();
    }

    public void repeatGame() {
        do {
            List<Integer> result = computer.compareNumbers(InputView.readUserNumbers());
            OutputView.printResult(result);
            if (result.get(0) == 3) {
                if (Integer.parseInt(InputView.readRetryNumber()) == 2) {
                    break;
                }
                computer.createNumbers();
                continue;
            }
        } while (true);
    }


}
