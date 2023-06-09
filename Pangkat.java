public class Pangkat {
    public static int hitungPangkat(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 3;
        int pangkat = 4;
        int hasil = hitungPangkat(angka, pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
