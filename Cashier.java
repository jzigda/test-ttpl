package week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cashier {
	private int count;
	private int n;
	private int discount;
	Map<Integer, Integer> map;
	//private int[] products;
	//private int[] prices;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
//	public int[] getProducts() {
//		return products;
//	}
//	public void setProducts(int[] products) {
//		this.products = products;
//	}
//	public int getPrices(int product) {
//		return prices[product];
//	}
//	public void setPrices(int[] prices) {
//		this.prices = prices;
//	}
	public Cashier(int n, int discount, int[] products, int[] prices) {
		count=0;
		this.n = n;
		this.discount = discount;
		map = new HashMap<>();
		for (int i = 0; i < prices.length; i++) {
			map.put(products[i], prices[i]);
		}
//		this.products = products;
//		this.prices = prices;
	}
	//@Override
//	public String toString() {
//		return "Cashier [n=" + n + ", discount=" + discount + ", products=" + Arrays.toString(products) + ", prices="
//				+ Arrays.toString(prices) + "]";
//	}
	
	double getBills(int[] product, int[] amount) {
		count++;
		double total =0.0;
		int rate =0;
		for (int i = 0; i < product.length; i++) {
			//rate = getPrices(i);
			total += map.get(product[i])*amount[i]; 
		
		}
		if (count==n) {
			count=0;
			return (total -(discount*total)/100); 
		}
		return total;
	}
	
}
