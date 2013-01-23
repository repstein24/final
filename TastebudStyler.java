public class TastebudStyler extends Employee {
	
	public TastebudStyler(){
		super();
		setBaseWeeklySalary(200);
	}
	public void passWeek(){
	
			work();
			setBaseWeeklySalary(getBaseWeeklySalary()*getEffectivenessMultiplier());
			earnPayCheck();

		setEffectivenessMultiplier(1);
	}
	public void work(){
		makeShake();
	}
	public void makeShake(){
		if (calculateChances(10) == true){
			setEffectivenessMultiplier(1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier()+.1);
		}
	}
}