public class Assignment01Q05 {


    public static int findShortestPath(int[][] matrix, int i, int j) {
       
        if (i == j) {
            return 0;
        }

        int n = matrix.length;
        int[] dist = new int[n];
        for (int k = 0; k < n; k++) {
            dist[k] = -1; 
        }

        
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        queue[tail++] = i;
        dist[i] = 0;

        while (head < tail) {
            int curr = queue[head++];

            if (curr == j) {
                return dist[curr];
            }

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (matrix[curr][neighbor] == 1 && dist[neighbor] == -1) {
                    dist[neighbor] = dist[curr] + 1;
                    queue[tail++] = neighbor;
                }
            }
        }

        return dist[j]; 
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}