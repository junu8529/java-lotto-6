package lotto.view;

public class OutputView {

    public static void printBuyLottoCount(int count) {
        System.out.println(count + "개를 구매했습니다.");
    }

    public static void printResultHead() {
        System.out.println("당첨 통계");
        System.out.println("---");
    }

    public static void printResultPrize(String prize, int count) {
        System.out.println(prize + count + "개");
    }

    public static void printResultRevenue(double revenue) {
        System.out.println("총 수익률은 " + String.format("%.1f", revenue) + "%입니다.");
    }
}