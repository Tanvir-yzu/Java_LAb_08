//Write a java program that reads a file poll.txt of poll data. The program should print how many electoral votes each candidate leads in, and who is leading overall in the polls. CT 56 31 7 Oct U.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class poll {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("poll.txt"));
        int obamaVot =0, trumpVot = 0;
        while(input.hasNext()){

            if(input.hasNextInt()){

                int obama = input.nextInt();
                int trump = input.nextInt();
                int vot = input.nextInt();
                if(obama> trump){
                    obamaVot = obamaVot + vot;
                } else if (trump>obama) {
                    trumpVot = trumpVot + vot;
                }
                else
                input.next();

                }
            }
        System.out.println("Obama: " + obamaVot);
        System.out.println("trump: "+ trumpVot);
        }

    }

