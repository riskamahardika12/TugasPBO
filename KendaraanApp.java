package kendaraanapp;

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

interface KendaraanListrik {
    void isiDaya(); 
}

class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }
    
    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

public class KendaraanApp {
    public static void main(String[] args) {

        System.out.println("=== Demonstrasi Abstract Class ===");
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new SepedaMotor("Honda");
        
        mobil.info();
        mobil.bergerak();
        
        motor.info();
        motor.bergerak();

        System.out.println("\n=== Demonstrasi Interface ===");
        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}