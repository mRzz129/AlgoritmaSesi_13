public class Fibonacci {
    public static int hitungFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return hitungFibonacci(n - 1) + hitungFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int panjang = 5;
        for (int i = 0; i < panjang; i++) {
            int hasil = hitungFibonacci(i);
            System.out.print(hasil + " ");
        }
    }
}
