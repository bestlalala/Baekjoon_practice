package Step6_function;

public class P4673 {

    public static int d(int n) {
        int result = n;
        while ( n > 0 ) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);

            if (n <= 10000)
                check[n] = true;
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i])
                System.out.println(i);
        }
    }
}
