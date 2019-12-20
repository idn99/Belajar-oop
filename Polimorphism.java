public class Polimorphism{
    public static void main(String[] args) {

        SegitigaDanPersegi snp = new SegitigaDanPersegi();
        System.out.println("Luas Segitiga : "+snp.luas(3.5, 9));
        System.out.println("Luas Persegi  : "+snp.luas(10, 20));
        
    }
}

class SegitigaDanPersegi{

    int luas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }

    double luas(double alas, double tinggi){
        double luas = alas * tinggi / 2;
        return luas;
    }

    
}