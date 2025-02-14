
class Segitiga {

    int alas;
    int tinggi;

    public void luas() {
        int luas = this.alas * this.tinggi / 2;
        System.out.println("Luas segitiga:" + luas);
    }

    public void keliling() {
        double miring = Math.sqrt(((this.alas/2) * (this.alas/2)) + (this.tinggi * this.tinggi));
        double keliling = miring * 2 + this.alas;
        System.out.println("keliling segitiga:" + keliling);
    }

    public Segitiga(int alasParam, int tinggiParam) {
        this.alas = alasParam;
        this.tinggi = tinggiParam;
    }

;
}
