//Given a file hours.txt with the following contents. Consider the task of computing hours worked by each person.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class hours {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("hours.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            int id = lineScanner.nextInt();
            String name = lineScanner.next();
            double sum = 0.0;
            int count = 0;
            while(lineScanner.hasNextDouble()){
                double hours = lineScanner.nextDouble();
                sum += hours;
                count++;
            }
            double average = sum/count;
            System.out.println(name + " "+ id +" "+  sum+ " " + average);
        }

    }}
