class Inheritance{
    public static void main(String[] args) {

        Musisi satria = new Musisi();
        satria.diberiNama("Satria");
        satria.manggung();
        satria.bacaNada();

        System.out.println();

        Pianis erte = new Pianis();
        erte.diberiNama("Erte");
        erte.bacaNada();
        erte.mainPiano();
        System.out.println();
        erte.speak("Hai Sonen of Chiyo");
        System.out.println();
        erte.manggung();
        
    }
}

class Musisi{
    String nama;
    // getter
    String getNama(){
        return this.nama;
    }
    // setter
    void diberiNama(String nama){
        this.nama = nama;
    }

    void speak(String word){
        System.out.println(word);
    }

    void menyanyi(){
        System.out.println(this.nama+" Bisa Menyanyi");
    }

    void bacaNada(){
        System.out.println(this.nama+" Bisa Baca Nada");
    }

    void manggung(){
        this.menyanyi();
    }
}

class Pianis extends Musisi{

    void mainPiano(){
        System.out.println(this.getNama()+" Bisa Main Piano");
    }
    @Override
    void speak(String word){
        this.menyanyi();
        System.out.println(word);
    }

    @Override
    void manggung(){
        super.manggung();
        this.mainPiano();
    }
}