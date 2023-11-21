package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.Computer;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {

    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer();
    }


    @DisplayName("컴퓨터 넘버 생성 정상 작동 테스트")
    @Test
    void createNumbers_EqaulResult_Success() {
        List<Integer> numbers = computer.createNumbers();

        assertThat(numbers.size()).isEqualTo(3);
    }


    @DisplayName("컴퓨터 번호 볼 비교 3볼 정상 작동 테스트")
    @Test
    void compareBallNumbers_EqualThreeBallResult_Success() {
        List<Integer> userNumbers = List.of(6, 9, 8);
        System.out.print(computer.createNumbers());
        int ballCount = computer.compareBallNumbers(userNumbers);
        assertThat(ballCount).isEqualTo(3);
    }

    @DisplayName("컴퓨터 번호 볼 비교 2볼 정상 작동 테스트")
    @Test
    void compareBallNumbers_EqualTwoBallResult_Success() {
        List<Integer> userNumbers = List.of(7, 9, 2);
        System.out.print(computer.createNumbers());
        int ballCount = computer.compareBallNumbers(userNumbers);
        assertThat(ballCount).isEqualTo(2);
    }

    @DisplayName("컴퓨터 번호 볼 비교 1볼 정상 작동 테스트")
    @Test
    void compareBallNumbers_EqualOneBallResult_Success() {
        List<Integer> userNumbers = List.of(4, 1, 2);
        System.out.print(computer.createNumbers());
        int ballCount = computer.compareBallNumbers(userNumbers);
        assertThat(ballCount).isEqualTo(1);
    }

    @DisplayName("컴퓨터 번호 볼 비교 0볼 정상 작동 테스트")
    @Test
    void compareBallNumbers_EqualZeroBallResult_Success() {
        List<Integer> userNumbers = List.of(5, 8, 4);
        System.out.print(computer.createNumbers());
        int ballCount = computer.compareBallNumbers(userNumbers);
        assertThat(ballCount).isEqualTo(0);
    }


}
