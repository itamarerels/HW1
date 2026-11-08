public class Assignment01Q03 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        long[] fib = new long[x];
        fib[0] = 1;
        fib[1] = 1;

        int oddCount = 2; // fib[0]=1 and fib[1]=1 are both odd

        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("The first " + x + " Fibonacci numbers are:");
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i] + (i == x - 1 ? "" : " "));
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + oddCount);
    }
}