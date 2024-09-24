
public class Main {
    public static void main(String[] args) {
        Barber b = new Barber();
        System.out.println(b);
        b.show();

        // Clinic c = new Clinic();
        // System.out.println(c);
        // c.show();
    }
}

abstract class Shop {
    abstract void show();
}

class Barber extends Shop {
    // @Override
    void show() {
        System.out.println("Barber");
    }
}

abstract class Clinic extends Shop {
    // void show() {
    //     System.out.println("Clinic");
    // }
    abstract void show();
}
