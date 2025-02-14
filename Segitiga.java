
class Segitiga {

    int alas;
    int tinggi;

    private int luas() {
        int luas = this.alas * this.tinggi;
        return luas / 2;
    }

    public Segitiga(int alasParam, int tinggiParam) {
        this.alas = alasParam;
        this.tinggi = tinggiParam;
        System.out.print("Luas segitiga:" + this.luas());
    }

;
}
