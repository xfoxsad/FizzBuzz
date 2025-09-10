package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean multia = i % a == 0;
            boolean multib = i % b == 0;
            if  (multia || multib) {
                count++;
            }
        }
        return count;
    }
}
