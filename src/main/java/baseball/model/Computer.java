package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    List<Integer> ComputerNumbers = new ArrayList<>();

    public List<Integer> createNumbers() {
        while (ComputerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!ComputerNumbers.contains(randomNumber)) {
                ComputerNumbers.add(randomNumber);
            }
        }
        return ComputerNumbers;
    }


    public int compareBallNumbers(List<Integer> userNumbers) {
        int ballCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (ComputerNumbers.contains(userNumbers.get(i)) && userNumbers.get(i) != ComputerNumbers.get(i)) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
