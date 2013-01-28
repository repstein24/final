public class Moover extends Employee {
	public Moover(){
		super();
		setBaseWeeklySalary(100);
	}
	public void passWeek(){

			work();
			// @BC: I think this line is a subtle misunderstanding of the instructions (which led to some Employees making a ton of money)
			//			The base amount should never change. Instead this kind of multiplication should be happening in the earnPaycheck method
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