public class Task3 {
    public static int goldenRatio(int n) {
        if (n == 0) return 1;
        else return 1 + 1/goldenRatio(n -1);
    }
}
