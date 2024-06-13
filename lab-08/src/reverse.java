//Store a group of values into an array, Reverse and output them again, Create a reverse methoc
//first, and then use main method to call it..
//int[] a = {11, 42, -5, 27, 0, 89};

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] a = {11, 42, -5, 27, 0, 89};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] number) {
        for (int i = 0; i < number.length / 2; i++) {
            int temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }
    }
}
