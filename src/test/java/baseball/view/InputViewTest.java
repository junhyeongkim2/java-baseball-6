package baseball.view;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputViewTest {

    @DisplayName("숫자 입력 시 3자리가 아닌 숫자가 들어왔을 경우 예외 발생")
    @Test
    void readUserNumbers_IsNotThreeNumber_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateIsThreeNumber("3655")).isInstanceOf(IllegalArgumentException.class);
    }


}
