package week5;

import java.util.ArrayList;
import java.util.List;

public class Question12 {
	

	public static void main(String[] args) {
		int n=3;
		int discount =50;
		int[] products = {1,2,3,4,5,6,7};
		int[] prices = {100,200,300,400,300,200,100};
		List<Double> totalList = new ArrayList<>();
		Cashier c = new Cashier(n, discount, products, prices);
		int[] orderProduct1 = {1,2};
		int[] orderAmount1 = {1,2};
		double transaction1 = c.getBills(orderProduct1, orderAmount1);
		totalList.add(transaction1);
		int[] orderProduct2 = {3,7};
		int[] orderAmount2 = {10,10};
		double transaction2 = c.getBills(orderProduct2, orderAmount2);
		totalList.add(transaction2);
		int[] orderProduct3 = {1,2,3,4,5,6,7};
		int[] orderAmount3 = {1,1,1,1,1,1,1};
		double transaction3 = c.getBills(orderProduct3, orderAmount3);
		totalList.add(transaction3);
		int[] orderProduct4 = {4};
		int[] orderAmount4 = {10};
		double transaction4 = c.getBills(orderProduct4, orderAmount4);
		totalList.add(transaction4);
		int[] orderProduct5 = {7,3};
		int[] orderAmount5 = {10,10};
		double transaction5 = c.getBills(orderProduct5, orderAmount5);
		totalList.add(transaction5);
		int[] orderProduct6 = {7,5,3,1,6,4,2};
		int[] orderAmount6 = {10,10,10,9,9,9,7};
		double transaction6 = c.getBills(orderProduct6, orderAmount6);
		totalList.add(transaction6);
		int[] orderProduct7 = {2,3,5};
		int[] orderAmount7 = {5,3,2};
		double transaction7 = c.getBills(orderProduct7, orderAmount7);
		totalList.add(transaction7);
		for (double i : totalList) {
			System.out.print(i+" ");
		}
		
	}

}
