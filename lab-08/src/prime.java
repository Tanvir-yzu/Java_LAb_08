//Find and Print all the prime number between 101 and 200.Find and Print all the prime number between 101 and 200.
public class prime {
    public static void main(String[] args) {
        for(int i=101;i<=200;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int n) {
        return countPrimes(n) == 2;
    }
    public static int countPrimes(int n) {
        int save = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                save++;
            }
        }
        return save;
    }

    }





































































































































































































