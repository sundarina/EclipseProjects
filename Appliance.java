/*Домашние
электроприборы.
Определить
иерархию
электроприборов. Включить некоторые в розетку. Посчитать
потребляемую мощность Провести сортировку приборов в
квартире на основе мощности. Найти прибор в квартире,
соответствующий заданному диапазону параметров.*/

/*


*/

public class Appliance {
	private int power;
	private boolean state;

	public Appliance(int power, boolean state) {
		super();
		this.power = power;
		this.state = state;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power > 0) {
			this.power = power;
		}
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}

class AdjustableAppliance extends Appliance {

	private int regime;

	public AdjustableAppliance(int power, boolean state, int regime) {
		super(power, state);
		this.regime = regime;
	}

	public int getRegime() {
		return regime;
	}

	public void setRegime(int regime) {
		if (regime >= 1 && regime <= 4) {
			this.regime = regime;
		}
	}
}

class Iron extends AdjustableAppliance {

	public Iron(int power, boolean state, int regime) {
		super(power, state, regime);
	}
}

class Blender extends AdjustableAppliance {

	public Blender(int power, boolean state, int regime) {
		super(power, state, regime);
	}
}

class AirConditioning extends AdjustableAppliance {

	public AirConditioning(int power, boolean state, int regime) {
		super(power, state, regime);
	}
}

class ElectricRange extends AdjustableAppliance {

	public ElectricRange(int power, boolean state, int regime) {
		super(power, state, regime);
	}
}
