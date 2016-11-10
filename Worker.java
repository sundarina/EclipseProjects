
public abstract class Worker {

	private String id;
	private String name;

	public Worker(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract double averageMonthlySalary();

}

class HourlyPaymentWorker extends Worker {

	private double hourlyPayment;

	public HourlyPaymentWorker(String id, String name, double hourlyPayment) {
		super(id, name);
		this.hourlyPayment = hourlyPayment;

	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		if (hourlyPayment > 0)
			this.hourlyPayment = hourlyPayment;
	}

	@Override
	double averageMonthlySalary() {
		return 28 * 8 * hourlyPayment;
	}

}

class FixedPaymentWorker extends Worker {

	private double fixedPayment;

	public FixedPaymentWorker(String id, String name, double fixedPayment) {
		super(id, name);
		this.fixedPayment = fixedPayment;

	}

	public double getFixedPayment() {
		return fixedPayment;
	}

	public void setFixedPayment(double fixedPayment) {
		if (fixedPayment > 0)
			this.fixedPayment = fixedPayment;
	}

	@Override
	double averageMonthlySalary() {
		return fixedPayment;
	}
}