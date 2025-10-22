package exam1020;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emps =new Employee[2];
		emps[0] = new FullTimeEmployee("김자바","123",42000000);
		emps[1] = new PartTimeEmplotee("이자바","123",20000,160);

		for(int i=0; i< emps.length; i++) {
			String msg=emps[i].getName() + "," + emps[i].calculatePay();
			System.out.println(msg);
		}
	}

}
