
import java.util.Scanner;

class App {

    public static void main(String[] Args) {
        Pilihan();
    }

    private static void Pilihan() {
        boolean Start = true;
        Scanner input = new Scanner(System.in);
        while (Start) {
            System.out.println("0. Keluar");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga Sama Sisi");
            System.out.println("3. Lingkaran");
            System.out.println("4. Trapesium");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            if (pilihan == 0) {
                Start = false;
                input.close();
            }
            if (pilihan == 1) {
                System.out.print("Masukkan Panjang Sisi Persegi : ");
                int sisi = input.nextInt();
                Persegi.Output(sisi, Persegi.Keliling(sisi));

            }
            if (pilihan == 2) {
                System.out.print("Masukkan Alas Segitiga: ");
                int alas = input.nextInt();
                System.out.print("Masukkan Tinggi Segitiga: ");
                int tinggi = input.nextInt();
                var segitiga = new Segitiga(alas, tinggi);
                segitiga.luas();
                segitiga.keliling();
            }
            if (pilihan == 3) {
                System.out.print("Masukkan Diameter Lingkaran: ");
                int diameter = input.nextInt();
                var lingkaran = new Lingkaran(diameter);
                lingkaran.keliling();
                lingkaran.luas();
            }
            if (pilihan == 4) {
                System.out.print("Masukkan Panjang Sisi Atas Trapesium");
                int sisi_atas = input.nextInt();
                System.out.print("Masukkan Panjang Sisi Bawah Trapesium");
                int sisi_bawah = input.nextInt();
                System.out.print("Masukkan Panjang Sisi Tinggi Trapesium");
                int tinggi = input.nextInt();
                Trapesium.Output(sisi_atas, sisi_bawah, tinggi, Trapesium.Luas(sisi_atas, sisi_bawah, tinggi));

            }
        }
    }

}
