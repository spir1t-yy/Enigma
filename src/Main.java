import Encoder.Encoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.next().toCharArray();

        int[] params = {16, 21, 2};
        Encoder enigma = new Encoder(params);

        for (char symbol : word) {
            System.out.print((char)enigma.Encrypt(symbol));
        }

    }
}
