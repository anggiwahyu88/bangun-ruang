
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

            }
            if (pilihan == 2) {
                System.out.print("Masukan Lebar Segitiga: ");
                int alas = input.nextInt();
                System.out.print("Masukan Lebar Tinggi: ");
                int tinggi = input.nextInt();
                new Segitiga(alas, tinggi);

            }
            if (pilihan == 1) {

            }
        }
    }

}
