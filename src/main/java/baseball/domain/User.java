package baseball.domain;

import java.util.List;

public class User {


    private String userNumber;


    public void createUserNumber(String userNumber){
        this.userNumber = userNumber;
        validateUserNumber(userNumber);
    }



    public String getUserNumber(){
        return this.userNumber;
    }



    public void validateUserNumber(String userNumber) {
        if (userNumber.length() != 3) throw new IllegalArgumentException();

        for (int i = 0; i < userNumber.length(); i++) {
            if (userNumber.charAt(i) - '0' < 1 || userNumber.charAt(i) - '0' > 9) {
                throw new IllegalArgumentException();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (userNumber.charAt(i) == userNumber.charAt(j)) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }


}
