package multilevel.inheritance;

class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

public class multilevelinheritace {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();
        anggora.makan();  
        anggora.suara();  
        anggora.jenis();  
    }
}
