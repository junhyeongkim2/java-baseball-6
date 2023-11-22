package baseball.view;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputViewTest {

    @DisplayName("숫자 입력 시 3자리가 아닌 숫자가 들어왔을 경우 예외 발생")
    @Test
    void readUserNumbers_IsNotThreeNumber_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateIsThreeNumber("3655")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateIsThreeNumber("36")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateIsThreeNumber("3")).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("숫자가 아닌 값이 들어왔을 경우 예외 발생")
    @Test
    void readUserNumbers_IsNotInteger_ExceptionThrow() {
        assertThatThrownBy(() -> InputView.validateIsIntegerUserNumbers("a35")).isInstanceOf(
                IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateIsIntegerUserNumbers("eee")).isInstanceOf(
                IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateIsIntegerUserNumbers("#$#")).isInstanceOf(
                IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateIsIntegerUserNumbers("")).isInstanceOf(
                IllegalArgumentException.class);
    }


    @DisplayName("1 또는 2가 아닌 재시작 숫자가 입력 되었을 경우 예외 발생")
    @Test
    void readRetryNumber() {
        assertThatThrownBy(() -> InputView.validateRetryNumber("3")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateRetryNumber("4")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputView.validateRetryNumber("0")).isInstanceOf(IllegalArgumentException.class);
    }


}
