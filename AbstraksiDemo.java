package contoh.pkg1;

abstract class Kendaraan {
    String nama;


    public Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void bergerak();

    public void info() {
        System.out.println(nama + " adalah kendaraan.");
    }
}

// Subclass yang mengimplementasikan method abstrak
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan roda.");
    }
}

class Kapal extends Kendaraan {
    public Kapal(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak di air.");
    }
}

public class AbstraksiDemo {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Titanic");

        mobil.info();
        mobil.bergerak();

        kapal.info();
        kapal.bergerak();
    }
}
