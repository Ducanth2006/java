package buoi_9_polymorphism;

class animal {
    public void keu() {
        System.out.println("Động vật kêu");
    }
}

class dog extends animal {
    public void keu() {
        System.out.println("gâu gâu");
    }
}

class cat extends dog {
    public void keu() {
        System.out.println("siuuuuu");
    }
}

class bird extends animal {
    public void keu() {
        System.out.println("singing");
    }
}

public class main {
    public static void main(String[] args) {
        animal a = new bird();
        animal b = new dog();
        animal c = new animal();
        animal d = new cat();
        a.keu();
        b.keu();
        c.keu();
        d.keu();
        
    }
}
