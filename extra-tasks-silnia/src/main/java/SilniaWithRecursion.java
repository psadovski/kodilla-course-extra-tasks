public class SilniaWithRecursion {
    public int silnia(int value) {
        if (value == 0 || value == 1) {
            return 1;
        } else {
            return value * silnia(value - 1);
        }
    }
}
