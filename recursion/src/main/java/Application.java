public class Application {
    public static void main(String[] args) {

        int valuea = 6;

        for (int i = 1; i <= valuea; i++) {
            System.out.println(Task1.countSequence(i));
        }

        System.out.println();

        for (int i = 1; i <= valuea; i++) {
            System.out.println(Task2.f(i));
        }

        System.out.println();
        System.out.println(Task3.goldenRatio(25));
        System.out.println();
        System.out.println(Task4.mystery(4, 18));
    }
}
