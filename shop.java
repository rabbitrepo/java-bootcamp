public class shop {
    class Shirt {
        char size;
        double price;

        double getSpecialPrice() {
            return 0.9 * price;
        }
    }

    public static void main(String[] args) {
        Shirt S = new Shirt();
        
        System.out.println("Welcome to my shop!");
    }
}
