package JavaExercises;


public class OddAndEvenNumber {
    /**
     * 呼叫input Function
     */
    public static void main(String[] args) {
        input();
    }

    /**
     * 指定數字範圍
     */
    private static void input() {
        int input = 100;
        dealWith(input);
    }

    /**
     * @param input 數字範圍
     *              判斷過程使用for迴圈
     */
    private static void dealWith(int input) {
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                String Odd = "雙數";
                output(i, Odd);
            } else if (i % 3 == 0) {
                String Even = "單數";
                output(i, Even);
            }
        }
    }

    /**
     * @param i      數字
     * @param result 結果
     */
    private static void output(int i, String result) {
        System.out.println(i + "(" + result + ")");
    }
}
