package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static void printInputNumberMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static String getInputNumber(){
        return Console.readLine();
    }





}