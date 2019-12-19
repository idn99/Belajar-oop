class TugasInheritance{
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        persegi.setSisi(3);

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setLebar(2);
        persegiPanjang.setPanjang(4);

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(5);
        segitiga.setTinggi(7);
        segitiga.setJarakAB(10);
        segitiga.setJarakBC(12);
        segitiga.setJarakCA(9);

        Layang2 layang2 = new Layang2();
        layang2.setDiagonal1(17);
        layang2.setDiagonal2(14);
        layang2.setJarakAB(12);
        layang2.setJarakBC(11.5);

        persegi.hitungLuas();
        persegiPanjang.hitungLuas();
        segitiga.hitungLuas();
        layang2.hitungLuas();

        System.out.println();

        persegi.hitungKeliling();
        persegiPanjang.hitungKeliling();
        segitiga.hitungKeliling();
        layang2.hitungKeliling();
    }
}

class BangunDatar{
    double luas;
    double keliling;

    void hitungLuas(){
        System.out.println("Luasnya Adalah .... ");
    }

    void hitungKeliling(){
        System.out.println("Kelilingnya Adalah ... ");
    }
}

class Persegi extends BangunDatar{
    double sisi;

    void setSisi(double sisi){
        this.sisi = sisi;
    }

    double getSisi(){
        return this.sisi;
    }

    @Override
    void hitungLuas(){
        this.luas = this.sisi*this.sisi;
        System.out.println("Luas Persegi : "+this.luas);
    }

    @Override
    void hitungKeliling(){
        this.keliling = this.sisi*4;
        System.out.println("Keliling Persegi : "+this.keliling);
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang;
    double lebar;

    void setPanjang(double panjang){
        this.panjang = panjang;
    }

    double getPanjang(){
        return this.panjang;
    }

    void setLebar(double lebar){
        this.lebar = lebar;
    }

    double getLebar(){
        return this.lebar;
    }

    @Override
    void hitungLuas(){
        this.luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang = "+this.luas);
    }

    @Override
    void hitungKeliling(){
        this.keliling = 2 * (this.panjang+this.lebar);
        System.out.println("Keliling Persegi Panjang = "+this.keliling);
    }
}

class Segitiga extends BangunDatar{
    double alas;
    double tinggi;
    double jarakAB;
    double jarakBC;
    double jarakCA;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJarakAB() {
        return jarakAB;
    }

    public void setJarakAB(double jarakAB) {
        this.jarakAB = jarakAB;
    }

    public double getJarakBC() {
        return jarakBC;
    }

    public void setJarakBC(double jarakBC) {
        this.jarakBC = jarakBC;
    }

    public double getJarakCA() {
        return jarakCA;
    }

    public void setJarakCA(double jarakCA) {
        this.jarakCA = jarakCA;
    }

    @Override
    void hitungLuas(){
        this.luas = this.alas*this.tinggi/2;
        System.out.println("Luas Segitiga = "+this.luas);
    }


    @Override
    void hitungKeliling(){
        this.keliling = this.jarakAB + this.jarakBC + this.jarakCA;
        System.out.println("Keliling Segitiga = "+this.keliling);
    }

}

class Layang2 extends BangunDatar{
    double diagonal1;
    double diagonal2;
    double jarakAB;
    double jarakBC;

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getJarakAB() {
        return jarakAB;
    }

    public void setJarakAB(double jarakAB) {
        this.jarakAB = jarakAB;
    }

    public double getJarakBC() {
        return jarakBC;
    }

    public void setJarakBC(double jarakBC) {
        this.jarakBC = jarakBC;
    }

    @Override
    void hitungLuas(){
        this.luas = this.diagonal1 * this.diagonal2 / 2;
        System.out.println("Luas Layang-Layang = "+this.luas);
    }

    @Override
    void hitungKeliling(){
        this.keliling = (this.jarakAB + this.jarakBC)*2;
        System.out.println("Keliling Layang-Layang = "+this.keliling);
    }
}