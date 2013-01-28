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
	// @BC: Looking at the way these two methods are used in the subclasses, I think it would have been more efficient
	//			to have mutator methods to increase and decrease the EM
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
	// @BC: Great idea to reuse this method as well. Only problem with the implementation in subclasses: employees should work 5x per week
	public abstract void passWeek();
	public abstract void work();
	// @BC: Each paycheck should be the product of the base salary * the weekly EM value
	//			See note in the Moover class for more
	public void earnPayCheck() {
		setTotalPaymentToDate(getTotalPaymentToDate()+getBaseWeeklySalary());
	}
	public void earnBonus(int num){
		setTotalPaymentToDate(getTotalPaymentToDate()+num);
	}
	
	// @BC: Good choice to reuse the calculateChances method!
	public boolean calculateChances(int p) {
		Random r = new Random();
		int myNum = r.nextInt(100);
		return myNum<p;
	}

}