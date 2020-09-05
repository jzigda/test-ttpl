package am.iunetworks.KinzangChedup.week5;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by kinza on 9/5/2020.
 */
public class Q12Discount {
    public static void main(String[] args) {
        int n = 3;
        int discount = 50;
        int products[] = {1, 2, 3, 4, 5, 6, 7};
        int prices[] = {100, 200, 300, 400, 300, 200, 100};
        Cashier cashier = new Cashier(n, discount, products, prices);
        System.out.println(cashier.getBill(new int[]{1, 2}, new int[]{1, 2}));                        // return 500.0, bill = 1 * 100 + 2 * 200 = 500.
        System.out.println(cashier.getBill(new int[]{3, 7}, new int[]{10, 10}));                      // return 4000.0, 10*300 + 10*100 = 4000
        System.out.println(cashier.getBill(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 1, 1, 1, 1, 1, 1}));    // return 800.0, The bill was 1600.0 but as this is the third customer, he has a discount of 50% which means his bill is only 1600 - 1600 * (50 / 100) = 800.
        System.out.println(cashier.getBill(new int[]{4}, new int[]{10}));                           // return 4000.0, 10 * 400=4000
        System.out.println(cashier.getBill(new int[]{7, 3}, new int[]{10, 10}));                      // return 4000.0
        System.out.println(cashier.getBill(new int[]{7, 5, 3, 1, 6, 4, 2}, new int[]{10, 10, 10, 9, 9, 9, 7})); // return 7350.0, Bill was 14700.0 but as the system counted three more customers, he will have a 50% discount and the bill becomes 7350.0
        System.out.println(cashier.getBill(new int[]{2, 3, 5}, new int[]{5, 3, 2}));
    }
}
class Cashier {
    private Map<Integer, Integer> productPriceMap;
    private int discountedAt = 0;
    private int customerCount = 0;
    private int totalDiscount = 0;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        discountedAt = n;
        totalDiscount = discount;
        productPriceMap = new HashMap<>();
        for(int i=0;i<products.length;i++){
            productPriceMap.put(products[i],prices[i]);
        }
    }
    public double getBill(int[] product, int[] amount) {
        customerCount++;
        double totalAmount = 0;
        System.out.println(customerCount);
        for(int i=0;i<product.length;i++){
            totalAmount += (productPriceMap.get(product[i])*amount[i]);
        }
        if(customerCount%discountedAt==0){
            totalAmount -= ((totalAmount*totalDiscount)/100);
        }
        return totalAmount;
    }
}