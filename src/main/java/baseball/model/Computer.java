package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    List<Integer> computerNumbers = new ArrayList<>();

    public List<Integer> createNumbers() {
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        return computerNumbers;
    }


    public int compareBallNumbers(List<Integer> userNumbers) {
        int ballCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumbers.contains(userNumbers.get(i)) && userNumbers.get(i) != computerNumbers.get(i)) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int compareStrikeNumbers(List<Integer> userNumbers) {
        return (int) userNumbers.stream().filter(userNumber -> computerNumbers.contains(userNumber)).count();
    }
}
