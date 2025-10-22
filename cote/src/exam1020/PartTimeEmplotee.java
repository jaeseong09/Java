package exam1020;

public class PartTimeEmplotee extends Employee{
	 private int hourRate;
	 private int wortHour;

	 
	 public PartTimeEmplotee(String name,String employeeId,int hourRate,int wortHour) {
		 super(name,employeeId);
		 this.hourRate=hourRate;
		 this.wortHour=wortHour;
	 }
	 
	 
	 public int getHourRate() {
		return hourRate;
	}


	 public void setHourRate(int hourRate) {
		 this.hourRate = hourRate;
	 }


	 public int getWortHour() {
		 return wortHour;
	 }


	 public void setWortHour(int wortHour) {
		 this.wortHour = wortHour;
	 }


	 @Override
	 public int calculatePay() {
		 return hourRate*wortHour;
	 }
}
