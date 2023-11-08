package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InputView {
    private static final String MESSAGE_LOTTO_PRICE = "구입금액을 입력해 주세요.";
    private static final String MESSAGE_LOTTO_NUMBER_INPUT = "당첨 번호를 입력해 주세요.";
    private static final String MESSAGE_LOTTO_BONUS_NUMBER_INPUT = "보너스 번호를 입력해 주세요.";

    private static List<Integer> winningNumberList;

    public static String inputPlayerAmount() {
        System.out.println(MESSAGE_LOTTO_PRICE);
        return Console.readLine();
    }

    public static List<Integer> inputLottoWinningNum() {
        System.out.println(MESSAGE_LOTTO_NUMBER_INPUT);
        return numberList(Console.readLine());
    }

    public static int inputBonusNumber() {
        System.out.println(MESSAGE_LOTTO_BONUS_NUMBER_INPUT);
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> numberList(String winningNumber) {
        String[] result = winningNumber.split(",");
        winningNumberList = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            winningNumberList.add(conventToInt(result[i]));
        }
        return winningNumberList;
    }

    private static int conventToInt(String inputNumber) {
        try {
            return Integer.parseInt(inputNumber);
        } catch (NumberFormatException e) {
            ExceptionMessage.typeException();
            throw new IllegalArgumentException();
        }
    }
}