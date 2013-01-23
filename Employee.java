import java.util.Random;

public abstract class Employee {
	private double effectivenessMultiplier;
	private double baseWeeklySalary;
	private double totalPaymentToDate;
	
	public Employee() {
		effectivenessMultiplier = 1;
		totalPaymentToDate = 0;
	}
	
	public double getEffectivenessMultiplier() {
		return effectivenessMultiplier;
	}
	public void setEffectivenessMultiplier(double d) {
		effectivenessMultiplier = d;
	}
	public double getBaseWeeklySalary() {
		return baseWeeklySalary;
	}
	public void setBaseWeeklySalary(double d) {
		baseWeeklySalary  = d;
	}
	public double getTotalPaymentToDate() {
		return totalPaymentToDate;
	}
	public void setTotalPaymentToDate(double d) {
		totalPaymentToDate = d;
	}
	public abstract void passWeek();
	public abstract void work();
	public void earnPayCheck() {
		setTotalPaymentToDate(getTotalPaymentToDate()+getBaseWeeklySalary());
	}
	public void earnBonus(int num){
		setTotalPaymentToDate(getTotalPaymentToDate()+num);
	}
	public boolean calculateChances(int p) {
		Random r = new Random();
		int myNum = r.nextInt(100);
		return myNum<p;
	}

}