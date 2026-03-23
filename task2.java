import java.util.Scanner;

public class Main {

    public static int sumElements(Scanner sc, int n) {
        if (n == 0) {
            return 0;
        }
        return sc.nextInt() + sumElements(sc, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = sumElements(sc, n);
        double average = (double) sum / n;

        System.out.println(average);
    }
}
