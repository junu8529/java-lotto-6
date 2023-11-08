package lotto.domain;

import java.util.Arrays;
import java.util.function.BiPredicate;

public enum Prize {
    NONE(0, 0, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber < 3),
    FIFTH(5000, 3, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber == 3),
    FORTH(50000, 4, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber == 4),
    THIRD(1500000, 5, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber == 5 && !ifBonusNumber),
    SECOND(30000000, 5, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber == 5 && ifBonusNumber),
    FIRST(2000000000, 6, (matchLottoNumber, ifBonusNumber) -> matchLottoNumber == 6);

    private final int money;
    private final int countMatch;
    private final BiPredicate<Integer, Boolean> ifBonusNumber;

    Prize(final int money, final int countMatch, final BiPredicate<Integer, Boolean> ifBonusNumber) {
        this.money = money;
        this.countMatch = countMatch;
        this.ifBonusNumber = ifBonusNumber;
    }

    public static Prize getPrize(final int matchLottoNumber, final boolean ifBonusNumber) {
        return Arrays.stream(Prize.values())
                .filter(prize -> prize.ifBonusNumber.test(matchLottoNumber, ifBonusNumber))
                .findAny()
                .orElse(NONE);
    }

    public int getMoney() {
        return money;
    }

    public int getCountMatch() {
        return countMatch;
    }
}