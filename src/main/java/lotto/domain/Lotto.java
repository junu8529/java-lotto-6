package lotto.domain;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;
    private static final int LOTTO_SIZE = 6;
    private static final int LOTTO_NUMBER_MAX = 45;
    private static final int LOTTO_NUMBER_MIN = 1;


    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개의 숫자여야 합니다.");
        }

        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복되지 않는 숫자여야 합니다.");
        }

        if (Collections.max(numbers) > LOTTO_NUMBER_MAX || Collections.min(numbers) < LOTTO_NUMBER_MIN) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    public List<Integer> getLotto() {
        return numbers;
    }

    public boolean containMatch(int number) {
        return numbers.contains(number);
    }

    public int countMatch(Lotto playLotto) {
        return (int) numbers.stream().filter(playLotto::containMatch).count();
    }
}
