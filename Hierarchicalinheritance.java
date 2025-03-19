package hierarchical_inheritance;

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

class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Main class
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        Anjing anjing1 = new Anjing();
        
        kucing1.makan();
        kucing1.suara();
        
        anjing1.makan();
        anjing1.suara();
    }
}
