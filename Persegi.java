public class Persegi {
    public static int Luas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
    public static int Keliling (int sisi) {
        int keliling = sisi * 4;
        return keliling;
    }
    public static int Panjang_sisi ( int keliling) {
        int panjang_sisi = keliling / 4 ;
        return panjang_sisi;

    }

    public static  void Output(int sisi, int keliling) {
        System.out.println("Luas Persegi adalah " + Luas(sisi));
        System.out.println("Keliling Persegi adalah " + Keliling(sisi));
        System.out.println("Panjang Sisi Persegi adalah " + Panjang_sisi(keliling));
        
    }
    
}


