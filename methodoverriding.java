package method.overriding;

class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass lain
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Main class
public class methodoverriding {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); 
        Hewan hewan2 = new Anjing();
        hewan1.bersuara(); 
        hewan2.bersuara();
    }
}
