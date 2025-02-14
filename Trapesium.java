public class Trapesium {
    public static int Luas(int sisi_atas, int sisi_bawah, int tinggi){
        int luas = (sisi_atas + sisi_bawah) / 2 * tinggi;
        return luas;
    }
    
    public static int Keliling(int sisi_atas, int sisi_bawah, int tinggi, int luas){
        int sisi_miring = (((sisi_bawah - sisi_atas) / 2)*((sisi_bawah - sisi_atas) / 2)) + (tinggi * tinggi);
        int keliling = (2 * sisi_miring) + sisi_atas + sisi_bawah;
        return keliling;
    }
    
    public static void  Output(int sisi_bawah, int sisi_atas, int tinggi, int luas){
        System.out.println("Luas Trapesium adalah " + Luas(sisi_atas, sisi_bawah, tinggi));
        System.out.println("Keliling Trapesium adalah " + Keliling(sisi_atas, sisi_bawah, tinggi,luas));
    }
}