package lotto.view;

public class ExceptionMessage {
    private static final int LOTTO_NUMBER_MAX = 45;
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_SIZE = 6;
    private static final int BONUS_LOTTO_SIZE = 6;
    private static final int MONEY_UNIT = 1000;
    private static final String EXCEED_NUMBER_RANGE_ERROR = "[ERROR] 로또 번호는 " + LOTTO_NUMBER_MIN + "부터 " + LOTTO_NUMBER_MAX + " 사이의 숫자여야 합니다.";
    private static final String EXCEED_NUMBER_SIZE_ERROR = "[ERROR] 로또 번호는 " + LOTTO_SIZE + "개여야 합니다.";
    private static final String EXCEED_BONUS_NUMBER_SIZE_ERROR = "[ERROR] 보너스 번호는 " + BONUS_LOTTO_SIZE + "개여야 합니다.";
    private static final String NUMBER_OVERLAP_ERROR = "[ERROR] 로또 번호는 중복되지 않는 숫자여야 합니다.";
    private static final String INPUT_TYPE_ERROR = "[ERROR] 숫자만 입력해야 합니다.";
    private static final String MINUS_MONEY_ERROR = "[ERROR] 로또 구입 금액은 0원보다 커야 합니다.";
    private static final String MONEY_UNIT_ERROR = "[ERROR] 로또 구입 금액은 " + MONEY_UNIT + "단위여야 합니다.";

    public static void exceedRangeException() {
        System.out.println(EXCEED_NUMBER_RANGE_ERROR);
    }

    public static void exceedSizeException() {
        System.out.println(EXCEED_NUMBER_SIZE_ERROR);
    }

    public static void exceedBonusSizeException() {
        System.out.println(EXCEED_BONUS_NUMBER_SIZE_ERROR);
    }

    public static void overlapException() {
        System.out.println(NUMBER_OVERLAP_ERROR);
    }

    public static void typeException() {
        System.out.println(INPUT_TYPE_ERROR);
    }

    public static void minusException() {
        System.out.println(MINUS_MONEY_ERROR);
    }

    public static void unitException() {
        System.out.println(MONEY_UNIT_ERROR);
    }

}