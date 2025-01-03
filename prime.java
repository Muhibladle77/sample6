public class prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");//set logic to display
            }
        }
    } //path for prime

    public static boolean isPrime(int n) {
        if (n < 2) return false;//set condition for removing less than 2 no.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true; //value return no
    }
}
