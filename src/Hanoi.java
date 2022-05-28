public class Hanoi {

    static void move(int d, String f, String t) {
        System.out.println("move disc " + d + " from " + f + " to " + t);
    }

    static int hanoi(int n, String a, String b, String c) {
        // Move n disks from a to c via b
        int res = 0;

        if(n == 0)
            return 0;

        if(n > 0) {
            res += hanoi(n - 1, a, c, b);
            move(n, a, c);
            res += hanoi(n - 1, b, a, c);
        }

        res++;

        return res;
    }

    public static void main(String[] args) {

        // Number of disks
        int n = 4;

        // Compute solution and number of moves
        int num_moves = hanoi(n, "A", "B", "C");

        // Print results
        System.out.println("total number of moves: " + num_moves);
    }
}
