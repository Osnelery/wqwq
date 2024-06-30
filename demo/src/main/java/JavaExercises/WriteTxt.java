package JavaExercises;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTxt {
    public static void main(String[] args) throws IOException {
        input();
    }

    /**
     * StringBuilder
     */
    private static void input() throws IOException {
        StringBuilder stringBuilder = new StringBuilder("transglobe");
        String text = ".com";
        append(stringBuilder, text);
    }

    private static void append(StringBuilder stringBuilder, String text) throws IOException {
        String newWord = String.valueOf(stringBuilder.append(text));
        output(newWord);
    }

    private static void output(String newWord) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write(newWord);
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
