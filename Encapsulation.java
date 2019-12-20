import java.util.Scanner;

class Encapsulation{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Persegi persegi = new Persegi();

        System.out.println("Masukan Panjang : ");
        persegi.setPanjang(scanner.nextDouble());
        System.out.println("Masukan Lebar : ");
        persegi.setLebar(scanner.nextDouble());


        System.out.println("Panjang Persegi : "+persegi.getPanjang());
        System.out.println("Lebar Persegi   : "+persegi.getLebar());

        persegi.hitung();
        
    }

    static class Persegi{
        private double panjang;
        private double lebar;

        public double getPanjang() {
            return panjang;
        }

        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }

        public double getLebar() {
            return lebar;
        }

        public void setLebar(double lebar) {
            this.lebar = lebar;
        }

        public void hitung(){
            double luas = getPanjang()*getLebar();
            System.out.println("Hasilnya        : "+luas);
        }
    }
} 