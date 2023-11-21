package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.Computer;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {


    @DisplayName("컴퓨터 넘버 생성 정상 작동 테스트")
    @Test
    void createNumbers_EqaulResult_Success() {
        Computer computer = new Computer();
        List<Integer> numbers = computer.createNumbers();

        assertThat(numbers.size()).isEqualTo(3);

    }


}
