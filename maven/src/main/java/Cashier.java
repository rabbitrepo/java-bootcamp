public class Cashier {
    double getTotal(double price) {
        // if (price >= 100) return price * 0.95;
        // else return price;

        return price >= 100 ? price * 0.95 : price;
    }
}