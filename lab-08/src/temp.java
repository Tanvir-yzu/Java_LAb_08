//Reads the days and each day's temperature from keyboard, computes average temperature and how many days above the average, how many days below the average. Finally, output the average temperature, above days and below days.
import java.util.*;
public class temp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days temperatures : ");
        int days= scanner.nextInt();
        int [] temp = new int[days];
        for(int i=0; i<days; i++){
            System.out.print("day "+(i+1)+" in");
            temp[i] = scanner.nextInt();
        }
        System.out.println("Temperature : "+ Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("Two colder days "+ temp[0]+","+temp[1]);
        System.out.println("two Hottest days " + temp[temp.length -1]+ ","+temp[temp.length -2]);
    }
}
