import java.util.Arrays;

public class NumberSwap {
    public static void main(String[] args) {
        System.out.print("Numbers received: ");
        Arrays.stream(args).forEach(s -> String.format("%s, ", s));
        int first = Integer.parseInt(args[0]);
        System.out.println("first = " + first);
        int second = Integer.parseInt(args[1]);
        System.out.println("second = " + second);
        System.out.println("Swapping...");
        first = first + second;
        System.out.println("first = first + second = " + first);
        second = first - second;
        System.out.println("second = first - second = " + second);
        first = first - second;
        System.out.println("first = first - second = " + first);
    }
}
