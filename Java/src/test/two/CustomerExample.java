package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("위재성","010-1234-5678");
		Customer cust2 = new Customer("허재원","010-8765-4321",100);
		
		cust1.updatePoint(50);
		System.out.println(cust1.point);
		
		cust2.updatePoint(-50);
		System.out.println(cust1.point);
		
		cust2.setPoint(200);
		System.out.println(cust2.point);
	}

}
