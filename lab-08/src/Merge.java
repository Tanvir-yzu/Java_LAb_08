//Write a method merge that accepts two arrays values and returns a new array containing allelements of the first array followed by all elements of the second. Use main method to call themerge, and then output the new array.
//Array 1: 12, 34, 56.
//Array 2: 7,8, 9, 10.
import java.util.Arrays;
public class Merge {
    public  static void main(String[] args){
        int[] al={12,34,56};
        int[] a2={7,8,9, 10};
        int[] a3= merge(al,a2);
        System.out.println(Arrays.toString(a3));
    }
    public static int[] merge(int[] a1,int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        return result;

    }
}
