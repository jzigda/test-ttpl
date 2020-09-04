package am.iunetworks.DorjiNorbu.questionTwelve;

/**
 * Created by Dorji Norbu on 04-Sep-20.
 */
public class Cashier {
    private int customer, discount, counter = 0;
    private int[] products, prices;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.customer = n;
        this.discount = discount;
        this.products = products;
        this.prices = prices;
    }

    public double getBill(int[] product, int[] amount) {
        int[] price = getPrices();
        double totalBill = 0;
        for (int i = 0; i < product.length; i++) {
            totalBill += (amount[i] * price[product[i] - 1]);
        }

        if (getCounter() == getCustomer()) {
            setCounter(0);
            System.out.print("The bill was " + totalBill + " but as this is the third customer,\nhe/she has he discount"
                    + "of 50% which means the bill is only ");
            return totalBill - ((getDiscount() * totalBill) / 100);
        }
        return totalBill;
    }

    public int getCustomer() {
        return customer;
    }

    public int getDiscount() {
        return discount;
    }

    public int[] getProducts() {
        return products;
    }

    public int[] getPrices() {
        return prices;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
