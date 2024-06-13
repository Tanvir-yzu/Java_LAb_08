import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(new File("numbers.txt"));

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("Numbers in the file:");
        System.out.println(numbers);

        scanner.close();
    }
}
