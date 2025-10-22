package exam1020;

public class FullTimeEmployee extends Employee{
	 private int annualsalary;
	 
	 public FullTimeEmployee(String name,String employeeId,int annualsalary) {
		 super(name,employeeId);
		 this.annualsalary=annualsalary;
	 }
	 public int getAnnualsalary() {
		 return annualsalary;
	 }
	 public void setAnnualsalary(int annualsalary) {
		 this.annualsalary=annualsalary;
	 }
	 
	 @Override
	 public int calculatePay() {
		 return annualsalary/12;
	 }
}
