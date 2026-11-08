public class Assignment01Q02 {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;


        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 1) {
                sum -= term;
            } else {
                sum += term;
            }
        }

        double piApprox = 4.0 * sum;

        
        System.out.println(piApprox + " " + Math.PI);
    }
}