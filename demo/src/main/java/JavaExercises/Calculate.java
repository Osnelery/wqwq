package JavaExercises;

public class Calculate {
   //在console顯示出數字1跟數字2 加減乘除的所有結果


    /**
     * 啟動input Function
     */
    public static void main(String[] args) {
        input();
    }

    /**
     * numberOne 數字1
     * numberTwo 數字2
     * 將數字輸出到計算Function
     */
    private static void input() {
        int numberOne = 1;
        int numberTwo = 2;
        plus(numberOne, numberTwo);
        minus(numberOne, numberTwo);
        multipliedBy(numberOne, numberTwo);
        dividedBy(numberOne, numberTwo);
    }

    /**
     * @param input1 數字1
     * @param input2 數字2
     * 加法並且將結果輸出到output
     */
    private static void plus(int input1, int input2) {
        int plusResult = input1 + input2;
        output(plusResult);
    }

    /**
     * @param input1
     * @param input2
     * 減法並且將結果輸出到output
     */
    private static void minus(int input1, int input2) {
        int minusResult = input1 - input2;
        output(minusResult);
    }

    /**
     * @param input1 數字1
     * @param input2 數字2
     * 乘法並且將結果輸出到output
     */
    private static void multipliedBy(int input1, int input2) {
        int multipliedByResult = input1 * input2;
        output(multipliedByResult);
    }

    /**
     * @param input1 數字1
     * @param input2 數字2
     * 除法並且將結果輸出到output
     */
    private static void dividedBy(int input1, int input2) {
        int dividedByResult = input1 / input2;
        output(dividedByResult);
    }

    /**
     * @param result 計算結果
     * 輸出所有結果
     */
    private static void output(int result) {
        System.out.println(result);
    }
}
