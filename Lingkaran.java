
class Lingkaran {

    int diameter;

    public Lingkaran(int diameterParam) {
        this.diameter = diameterParam;
    }

    public void luas() {
        float luas = 3.14f * (this.diameter / 2) * (this.diameter / 2);
        System.out.println("Luas lingkaran:" + luas);
    }

    public void keliling() {
        float keliling = 3.14f * this.diameter;
        System.out.println("Keliling lingkaran:" + keliling);
    }
;
}
