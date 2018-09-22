public class SilniaWithLoop {
    public void silnia(int value) {
        int result = 1;

        if (value == 0 || value == 1) {
            result = 1;
            System.out.println(result);
        } else {
            for (int i = 1; i <=value; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
