package lotto.domain;

import java.util.Collections;
import java.util.List;

public class LottoBonusNumber {

    private final int number;
    private static final int LOTTO_NUMBER_MAX = 45;
    private static final int LOTTO_NUMBER_MIN = 1;

    public LottoBonusNumber(int number){
        validate(number);
        this.number = number;
    }

    private void validate(int number){

        if (number > LOTTO_NUMBER_MAX || number < LOTTO_NUMBER_MIN) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    public int getLottoBonusNumber() {
        return number;
    }

    public Boolean countMatch(Lotto playLotto) {
        return playLotto.containMatch(number);
    }
}
