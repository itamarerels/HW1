import java.util.Arrays;

public class Assignment01Q04 {


    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        
        if (direction != 'R' && direction != 'L') {
            return array;
        }
        if (array == null || array.length <= 1) {
            return array;
        }

        
        int effRightShift = (direction == 'R') ? move : -move;

        int n = array.length;
        
        int shift = ((effRightShift % n) + n) % n;

        if (shift == 0) {
            return array;
        }

        // Create temporary array to hold original values
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }

        // Apply shift into original array reference
        for (int i = 0; i < n; i++) {
            array[(i + shift) % n] = temp[i];
        }

        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}