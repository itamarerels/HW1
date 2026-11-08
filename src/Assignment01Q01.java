public class Assignment01Q01 {
    public static void main(String[] args) {
        // iterate over each string
        for (String str : args) {
            char first = str.charAt(0);

            if (first % 5 == 0 ) {
                System.out.println(first);
            }
        }
        
        
    }
}
