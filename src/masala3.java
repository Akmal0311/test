import java.util.Scanner;

public class masala3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String soz = scanner.nextLine();

        System.out.println(shifrlash(soz));

    }

    public static String shifrlash(String s1) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (i % 2 == 0) {
                if (c == 122)
                    c = (char) (c - 25);
                else {
                    c = (char) (c + 1);
                }
                sb.append(c);
            } else
                sb.append(c);
        }
        return sb.toString();
    }
}