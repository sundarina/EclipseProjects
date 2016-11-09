//Дарья Розумняк
//ООП / Задача с электроприборами

/*Домашние электроприборы.Определить иерархию электроприборов.
 *  Включить некоторые в розетку.  Посчитать потребляемую мощность.
 *   Провести сортировку приборов в 
 *   квартире на основе мощности. Найти прибор в квартире, 
 *   соответствующий заданному диапазону параметров.*/

public class Appliance {
	private int power;
	private boolean state;
	private String name;

	public Appliance(int power, boolean state, String name) {
		this.power = power;
		this.state = state;
		this.name = name;
	}

	public Appliance() {
		this.power = 4800;
		this.state = true;
		this.name = "Прибор";
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power > 0) {
			this.power = power;
		}
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class AdjustableAppliance extends Appliance {

	private int regime;
	

	public AdjustableAppliance(int power, boolean state, int regime, String name) {
		super(power, state, name);
		this.regime = regime;
		
	}

	public AdjustableAppliance() {
		setPower(1000);
		setState(false);
		setName("Особенный прибор");
		this.regime = 2;
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

	public Iron(int power, boolean state, int regime, String name) {
		super(power, state, regime, name);
	}

	public Iron() {
		setPower(4050);
		setState(true);
		setRegime(4);
		setName("Ошпаривалка");
	}
}

class Blender extends AdjustableAppliance {

	public Blender(int power, boolean state, int regime, String name) {
		super(power, state, regime, name);
	}

	public Blender() {
		setPower(1600);
		setState(true);
		setRegime(3);
		setName("Жужалка");
	}
}

class AirConditioning extends AdjustableAppliance {

	public AirConditioning(int power, boolean state, int regime, String name) {
		super(power, state, regime, name);
	}

	public AirConditioning() {
		setPower(2750);
		setState(false);
		setRegime(2);
		setName("Обдувало");
	}
}

class ElectricRange extends AdjustableAppliance {

	public ElectricRange(int power, boolean state, int regime, String name) {
		super(power, state, regime, name);
	}

	public ElectricRange() {
		setPower(5000);
		setState(true);
		setRegime(1);
		setName("Обогревало");
	}
}
