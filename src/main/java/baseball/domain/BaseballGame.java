package baseball.domain;

import java.util.HashMap;
import java.util.List;

public class BaseballGame {

    public List<Integer> createComputerNumber(){
        List<Integer> computerNumber;
        Computer computer = new Computer();
        computerNumber = computer.randomComputerNumber();
        return computerNumber;
    }


    public String compareTwoNumbers(String userNumber, List<Integer>computerNumber){

        int strikeCount=0;
        int ballCount=0;

        for(int i = 0 ; i < userNumber.length(); i++){
            if(userNumber.charAt(i)-'0' == computerNumber.get(i)){
                strikeCount++;
                continue;
            }
            if(computerNumber.contains(userNumber.charAt(i)-'0')){
                ballCount++;
            }
        }

        String result = strikeCount+","+ballCount;

        return result;

    }

    public String[] splitCountResult(String result){

        String[] results  = result.split(",");

        return results;

    }



}
