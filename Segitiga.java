
class Segitiga {

    int alas;
    int tinggi;

    public Segitiga(int alasParam, int tinggiParam) {
        this.alas = alasParam;
        this.tinggi = tinggiParam;
    }

    public int luas() {
        int luas = this.alas * this.tinggi;
        return luas / 2;
    }
;
}
