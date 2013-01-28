import java.util.Random;

public class Simulator {
	private Employee[] workers;
	private static Simulator s;
	private int weekCounter;
	
	public Simulator() {
		workers = new Employee[6];
		int weekCounter = 0;
		
		for (int i = 0; i < 2; i++) {
			TastebudStyler ts = new TastebudStyler();
			workers[i] = ts;
		}
		
		for (int j = 2; j < 4; j++) {
			Moover m = new Moover();
			workers[j] = m;
		}
		for (int h = 4; h < 6; h++) {
			Shakers s = new Shakers();
			workers[h] = s;
		}
		for (int b= 0; b<8;b++){
			for (int a = 0; a<6; a++){
				workers[a].passWeek();
				System.out.println("worker " +a+" has a total payment of "+workers[a].getTotalPaymentToDate()+ " and a salary of " +workers[a].getBaseWeeklySalary());
			}
			
			weekCounter++;
			if (weekCounter%4==0) {
				Random r = new Random();
				int myNum = r.nextInt(100);
				myNum=100+myNum;
				Random r2 = new Random();
				int x = r2.nextInt(workers.length);
				System.out.println("worker " +x+" got the bonus of $ " +myNum);
				// @BC: Very nicely done!
				workers[x].earnBonus(myNum);
			}
		}

	}
	public static void main(String[] args) {
		System.out.println("Hi there! Welcome to the simulation.Have a milkshake!");
		Simulator s = new Simulator();
	}
}