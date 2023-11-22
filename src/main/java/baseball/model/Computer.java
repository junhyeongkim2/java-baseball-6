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
        System.out.println(computerNumbers);
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
        int strikeCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) == computerNumbers.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public List<Integer> compareNumbers(String userNumbers) {
        List<Integer> numbers = transformStringtoList(userNumbers);
        return List.of(compareStrikeNumbers(numbers), compareBallNumbers(numbers));
    }

    public List<Integer> transformStringtoList(String userNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < userNumbers.length(); i++) {
            numbers.add(userNumbers.charAt(i) - '0');
        }
        return numbers;
    }


}
