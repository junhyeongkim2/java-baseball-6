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

        do {
            List<Integer> result = computer.compareNumbers(InputView.readUserNumbers());

            if (result.get(0) == 3) {
                int retryNumber = Integer.parseInt(InputView.readRetryNumber());
                if (retryNumber == 2) {
                    break;
                }
                continue;
            }
            OutputView.printResult(result);


        } while (true);

    }


}
