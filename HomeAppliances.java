//Дарья Розумняк
//ООП / Задача с электроприборами

public class HomeAppliances {

	Appliance[] appliances;

	private int appliancesCount;
	private int appliancesIndex = 0;

	public HomeAppliances(int appliancesCount) {
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

	public void randomParameters() { // заполнение мощности рандомно

		int power = (int) (Math.random() * 3200 + 100);

		int rand = (int) (Math.random() * 2);
		boolean state = true;
		if (rand == 0) {
			state = true;
		}
		state = false;

		int regime = (int) (Math.random() * 4 + 1); // выбор режима для каждого
													// прибора

		String name = "Случайный прибор";

		for (int i = 0; i < appliances.length; i++) {
			this.addAppliance(new AdjustableAppliance(power, state, regime, name));
		}
	}

	public double powerSum() {

		double sum = 0;

		for (int i = 0; i < appliances.length; i++) {
			if (appliances[i] instanceof AdjustableAppliance) {
				if (((AdjustableAppliance) appliances[i]).getState() == true) {
					if (((AdjustableAppliance) appliances[i]).getRegime() == 1) {
						sum += appliances[i].getPower() * 0.25;
					}
					if (((AdjustableAppliance) appliances[i]).getRegime() == 2) {
						sum += appliances[i].getPower() * 0.5;
					}
					if (((AdjustableAppliance) appliances[i]).getRegime() == 3) {
						sum += appliances[i].getPower() * 0.75;
					}
					if (((AdjustableAppliance) appliances[i]).getRegime() == 4) {
						sum += appliances[i].getPower();
					}
				}
			}
		}
		return sum;
	}

	public void powerSort() {

		for (int i = 0; i < appliances.length; i++) {
			for (int j = 0; j < appliances.length - i - 1; j++) {
				if (appliances[j].getPower() > appliances[j + 1].getPower()) {
					Appliance tmp = appliances[j];
					appliances[j] = appliances[j + 1];
					appliances[j + 1] = tmp;
				}
			}
		}
	}

	public Appliance powerDiapason(int min, int max) {
		for (int i = 0; i < appliances.length; i++) {
			if (appliances[i].getPower() >= min && appliances[i].getPower() <= max) {
				return appliances[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int appliancesCount = 5;
		int min = 2500;
		int max = 3000;

		Iron myIron = new Iron(2000, false, 3, "Утюг Phillips");
		Blender myBlender = new Blender(2200, true, 4, "Блендер Bosh");
		AirConditioning myAirConditioning = new AirConditioning(3000, true, 4, "Кондиционер Samsung");
		ElectricRange myElectricRange = new ElectricRange(3500, false, 2, "Обогреватель Lg");

		HomeAppliances myHome = new HomeAppliances(appliancesCount);
		myHome.addAppliance(myIron);
		myHome.addAppliance(myBlender);
		myHome.addAppliance(myAirConditioning);
		myHome.addAppliance(myElectricRange);
		myHome.randomParameters(); // заполнение случайными числами

		System.out.println("Общая мощность включенных приборов: " + myHome.powerSum());
		System.out.println();

		System.out.println("Рейтинг мощности электроприборов: ");
		myHome.powerSort();

		Appliance[] appliancesArray = myHome.getAppliance();
		for (int i = 0; i < appliancesArray.length; i++) {
			System.out.println(appliancesArray[i].getState() + " " + appliancesArray[i].getPower() + " "
					+ appliancesArray[i].getName());
		}

		System.out.println();
		Appliance app = myHome.powerDiapason(min, max);
		System.out.println(
				" Прибор " + app.getClass() + " соответствует заданному диапазону и имеет мощность: " + app.getPower());
	}
}
