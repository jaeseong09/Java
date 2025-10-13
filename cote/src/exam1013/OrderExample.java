package exam1013;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0]= new Menu("치킨",20000);
		menus[1]= new Menu("피자",22000);
		menus[2] = new Menu("떡볶",18000);
		
		Scanner scanner = new Scanner(System.in);
		int orderIndex = scanner.nextInt();
		int quantity = scanner.nextInt();
		scanner.close();
		
		if(orderIndex >= 0 && orderIndex < menus.length && quantity >0) {
			OrderItem order = new OrderItem(menus[orderIndex],2);
			System.out.println(order.getPrice());
		}
	}

}
