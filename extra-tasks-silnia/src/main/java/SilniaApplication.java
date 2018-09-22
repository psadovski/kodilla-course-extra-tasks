public class SilniaApplication {
    public static void main(String[] args) {

        SilniaWithLoop silniaWithLoop = new SilniaWithLoop();
        silniaWithLoop.silnia(4);

        SilniaWithRecursion silniaWithRecursion = new SilniaWithRecursion();
        System.out.println(silniaWithRecursion.silnia(4));

        SilniaWithStream silniaWithStream = new SilniaWithStream();
        System.out.println(silniaWithStream.silnia(7));
    }
}
