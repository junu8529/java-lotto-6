package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private static final Integer MIN_RANGE = 1;
    private static final Integer MAX_RANGE = 45;
    private static final Integer PICK_NUMBER = 6;

    public List<Lotto> newLotto(int lottoCount) {
        List<Lotto> lotto = new ArrayList<>();
        List<Integer> pickNumbers = Randoms.pickUniqueNumbersInRange(MIN_RANGE, MAX_RANGE, PICK_NUMBER);
        while (lotto.size() < lottoCount) {
            lotto.add((Lotto) pickNumbers);
        }
        return lotto;
    }
}
