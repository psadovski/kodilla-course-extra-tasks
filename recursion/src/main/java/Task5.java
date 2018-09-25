public class Task5 {
    public static int f(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int wynik = 0;

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        else {
            for (int i = 3; i <= n; i++) {
                wynik = 2 * b + a;
                a = b;
                b = c;
                c = wynik;
            }
            return wynik;
        }
    }
}
