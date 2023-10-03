public class StringReversal {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(reverseString(args[0]));
    }

    private static String reverseString(String arg) {
        char[] charArray = arg.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            sb.append(c);
        }
        return sb.toString();
    }
}