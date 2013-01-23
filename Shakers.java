public class Shakers extends Employee {
	public Shakers(){
		super();
		setBaseWeeklySalary(50);
	}
	public void passWeek(){

			work();
			setBaseWeeklySalary(getBaseWeeklySalary()*getEffectivenessMultiplier());
			earnPayCheck();
		setEffectivenessMultiplier(1);
	}
	public void work(){
		shake();
	}
	public void shake(){
		setEffectivenessMultiplier(getEffectivenessMultiplier()+.02);
	}
}