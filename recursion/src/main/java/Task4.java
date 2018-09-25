public class Task4 {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b%2 == 0) return mystery(a + a, b/2);
        else return mystery(a + a, b/2) + a;
    }
}
