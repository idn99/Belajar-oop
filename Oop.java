public class Oop{
    public static void main(String[] args) {

        // instansiasi objek /  membuat objek
        // NameClass nameObject = new Constructor() // Constructor biasanya nama class

        Mobil mobilAvanza = new Mobil();
        mobilAvanza.merk = "Toyota";
        mobilAvanza.warna = "Royal Blue";
        mobilAvanza.jumlahPintu = 5;
        mobilAvanza.platNomor = "A-2799 DN";
        mobilAvanza.jumlahRoda = 4;
        System.out.println(mobilAvanza.merk);
        mobilAvanza.nyalakanMesin();
        mobilAvanza.maju();

        System.out.println();

        Mobil mobilXenia = new Mobil();
        mobilXenia.merk = "Daihatsu";
        mobilXenia.warna = "Green Latern";
        System.out.println("Mobil "+mobilXenia.merk+" Yang Berwarna "+mobilXenia.warna);
        mobilXenia.nyalakanMesin();
        mobilXenia.mundur();
        mobilXenia.maju();
        mobilXenia.mundur();
        mobilXenia.maju();
        System.out.println("gak Cantik");
    }
}

// rancangan mobil
class Mobil{
    // atribute
    String merk;
    String warna;
    String platNomor;
    int jumlahRoda;
    int jumlahPintu;
    boolean mesinNyala=false;

    // method
    void nyalakanMesin(){

        //code mneyalakan mesin
        System.out.println("Mesin Menyala");
        mesinNyala=true;
    }
    void maju(){

        // code untuk mobil maju
        if (mesinNyala==true) {
            System.out.println("Mobil Maju");
        } else {
            System.out.println("Nyalain dulu cuk");
        }
        
    }

    void mundur(){
        //code untuk mobil mundur
        if (mesinNyala==true) {
            System.out.println("Mobil Mundur");
        } else {
            System.out.println("Nyalain dulu cuk");
        }
    }
}