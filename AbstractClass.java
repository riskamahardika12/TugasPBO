abstract class Kendaraan {
    String nama;
    int jumlahRoda;
    
    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }
    
 
    abstract void bergerak();
    
    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4); // Mobil selalu punya 4 roda
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2); 
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Main class untuk menjalankan program

/**
 *
 * @author darma
 */
public class AbstractClass {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota Vellfire");
        Kendaraan motor = new SepedaMotor("Honda CBR1000RR");
        
        mobil.info();
        mobil.bergerak();
        
        motor.info();
        motor.bergerak();
    }
}