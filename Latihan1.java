
class Hewan {
    String nama;
    String jenis;
    int umur;

  
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }

   
    public void bertambahUmur(int tahun) {
        umur += tahun;
        System.out.println("Setelah bertambah umur:");
        tampilkanInfo();
    }

    
    public void suaraHewan() {
        System.out.println(nama + " bersuara...");
    }
}


class Kucing extends Hewan {
    public Kucing(String nama, int umur) {
        super(nama, "Mamalia", umur);
    }

    
    @Override
    public void suaraHewan() {
        System.out.println(nama + ": Meong!");
    }
}


class Anjing extends Hewan {
    public Anjing(String nama, int umur) {
        super(nama, "Mamalia", umur);
    }

    
    @Override
    public void suaraHewan() {
        System.out.println(nama + ": Guk guk!");
    }
}


public class Latihan1 {
    public static void main(String[] args) {
        // Membuat objek kucing dan anjing
        Kucing kucing = new Kucing("Kucing", 3);
        Anjing anjing = new Anjing("Anjing", 2);

        
        kucing.tampilkanInfo();
        kucing.suaraHewan();
        kucing.bertambahUmur(2);

        System.out.println(); 

        anjing.tampilkanInfo();
        anjing.suaraHewan();
        anjing.bertambahUmur(2);
    }
}
