
import java.util.Scanner;

class App {

    static boolean start = true;

    public static void main(String[] Args) {
        Pilihan(start);
    }

    private static void Pilihan(boolean Start) {
        Scanner input = new Scanner(System.in);
        while (Start) {
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan Panjang Sisi Persegi : ");
                int sisi = input.nextInt();
                Persegi.Output(sisi, Persegi.Keliling(sisi));

            }
            if (pilihan == 2) {
                System.out.print("Masukkan Lebar Segitiga: ");
                int alas = input.nextInt();
                System.out.print("Masukkan Lebar Tinggi: ");
                int tinggi = input.nextInt();
                new Segitiga(alas, tinggi);

            }
            if (pilihan == 1) {

            }
        }
    }

}
