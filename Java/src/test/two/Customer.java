package test.two;

public class Customer {
 public String name;
 public String phoen;
 public int point;

 public Customer( String name, String phoen) {
	 this.name=name;
	 this.phoen=phoen;
	 this.point=0;
 }
 public Customer( String name, String phoen,int point) {
	 this.name=name;
	 this.phoen=phoen;
	 this.point=point;
 }
 
 public int updatePoint(int amount) {
	 point+=amount;
	 return point;
 }
 
 public int setPoint(int point) {
	 this.point=point;
	 return point;
 }
}
