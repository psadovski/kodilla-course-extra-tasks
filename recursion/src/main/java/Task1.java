public class Task1 {
    public static int countSequence(int n) {
        if (n == 1) {
            return 2;
        } else if (n%2 != 0) {
            return countSequence(n -1) * 2;
        } else {
            return countSequence(n - 1) + 2;
        }
    }
}
