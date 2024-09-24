public class Test {

    public void test1() {
        Cashier c = new Cashier();

        double a = c.getTotal(75);
        assert a == 75;
    }

    public void test2() {
        Cashier c = new Cashier();

        double a = c.getTotal(100);
        assert a == 95;
    }

    double delta = 0.00000001;

    public void test3() {
        Cashier c = new Cashier();

        double expected = 95.95;
        double start = expected - delta;
        double finish = expected + delta;
        double actual = c.getTotal(101);
        assert start <= actual && actual <= finish;
    }
}
