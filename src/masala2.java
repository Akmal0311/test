import java.util.Scanner;

public class masala2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int n = scanner.nextInt(), b = 1, result = 0;


        for (int i = 1; i <= n; i++){
            if(tubson(i)){
                b *= i;
            }
        }

        String res = Integer.toString(b);

        boolean tf = true;

        for(int i = res.length()-1; i >= 0; i--) {
            if(res.charAt(i) == '0'){
                result++;
            }else{
                break;
            }
        }

        System.out.println("ohiridagi nollar soni " + result);
    }

    public static boolean tubson(int n) {
        if (n == 1 || n == 0) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
