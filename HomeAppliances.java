
/*power
power socket
plugged in*/
public class HomeAppliances {

	//
	Appliance[] appliances;

	private int appliancesCount;
	private int appliancesIndex = 0;

	public HomeAppliances(int appliancesCount, int appliancesIndex) {
		this.appliancesCount = appliancesCount;
		this.appliances = new Appliance[appliancesCount];
	}

	public boolean addAppliance(Appliance app) {
		if (appliancesIndex < appliancesCount) {
			this.appliances[appliancesIndex] = app;
			appliancesIndex++;
			return true;
		}
		return false;
	}

	public Appliance[] getAppliance() {
		return appliances;
	}

	public void randomPower() {
		boolean state = true;
		int rand = (int) (Math.random() * 2);
		if (rand == 1) {
			state = true;
		}
		state = false;

		for (int i = 0; i < appliances.length; i++) {
			this.addAppliance(new Appliance((int) (Math.random() * 3200 + 100), state));
		}
	}

	public static void main(String[] args) {

	}

}
