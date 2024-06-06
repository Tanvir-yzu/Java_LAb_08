//Consider a file weather.txt as follow. Write a java program that prints the change in temperature between each pair of neighboring days .
import java.io.File;
import java.io.FileNotFoundException;
import  java.util.*;

public class weather {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("weather.txt"));
        double prev = input.nextDouble();
        while(input.hasNext()){

            if(input.hasNextDouble()){
                double next = input.nextDouble();
                System.out.println(prev + " to " + next + ", changed by " + (next - prev) );
                prev = next;

            }else{

                input.next();
            }
        }
    }
}
