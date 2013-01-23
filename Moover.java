public class Moover extends Employee {
	public Moover(){
		super();
		setBaseWeeklySalary(100);
	}
	public void passWeek(){

			work();
			setBaseWeeklySalary(getBaseWeeklySalary()*getEffectivenessMultiplier());
			earnPayCheck();

		setEffectivenessMultiplier(1);
	}
	public void work(){
		takeOrder();
		deliverShake();
	}
	public void takeOrder(){
		if (calculateChances(20)){
			setEffectivenessMultiplier(getEffectivenessMultiplier()-.1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier()+.05);
		}
	}
	public void deliverShake(){
		if (calculateChances(5)){
			setEffectivenessMultiplier(getEffectivenessMultiplier()-.1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier()+.03);
		}
	}
}