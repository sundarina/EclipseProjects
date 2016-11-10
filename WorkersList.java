import java.util.Arrays;

public class WorkersList {

	Worker[] workers;

	private int workerCount;
	private int workerIndex = 0;

	public WorkersList(int workerCount) {
		this.workerCount = workerCount;
		this.workers = new Worker[workerCount];
	}

	public boolean addWorker(Worker worker) {
		if (workerIndex < workerCount) {
			this.workers[workerIndex] = worker;
			workerIndex++;
			return true;
		}
		return false;
	}

	public Worker[] getWorker() {
		return workers;
	}

	public void workerSort() {

		for (int i = 0; i < workers.length; i++) {
			for (int j = 0; j < workers.length - i - 1; j++) {
				if (workers[j].averageMonthlySalary() < workers[j + 1].averageMonthlySalary()) {
					Worker tmp = workers[j];
					workers[j] = workers[j + 1];
					workers[j + 1] = tmp;
				}
				if (workers[j].averageMonthlySalary() == workers[j + 1].averageMonthlySalary()) {
					String s[] = workers[i].getName().split(" ");
					Arrays.sort(s);
				}
			}
		}

	}

	public static void main(String[] args) {

		int workerCount = 6;
		FixedPaymentWorker fworker1 = new FixedPaymentWorker("1-fixed", "Василий", 2500);
		FixedPaymentWorker fworker2 = new FixedPaymentWorker("2-fixed", "Данил", 3000);
		FixedPaymentWorker fworker3 = new FixedPaymentWorker("3-fixed", "Николай", 3000);
		HourlyPaymentWorker hworker4 = new HourlyPaymentWorker("4-hourly", "Вадим", 7.75);
		HourlyPaymentWorker hworker5 = new HourlyPaymentWorker("5-hourly", "Игорь", 8.50);
		HourlyPaymentWorker hworker6 = new HourlyPaymentWorker("6-hourly", "Юрий", 15.75);

		WorkersList wlist = new WorkersList(workerCount);
		wlist.addWorker(fworker1);
		wlist.addWorker(fworker2);
		wlist.addWorker(fworker3);
		wlist.addWorker(hworker4);
		wlist.addWorker(hworker5);
		wlist.addWorker(hworker6);

		wlist.workerSort();

		Worker[] sortedWorker = wlist.getWorker();
		for (int i = 0; i < sortedWorker.length; i++) {
			System.out.println(sortedWorker[i].averageMonthlySalary() + "  id: " + sortedWorker[i].getId() + " Name: "
					+ sortedWorker[i].getName());
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(sortedWorker[i].averageMonthlySalary() + "  id: " + sortedWorker[i].getId() + " Name: "
					+ sortedWorker[i].getName());
		}

		System.out.println();
		for (int i = (sortedWorker.length - 3); i < sortedWorker.length; i++) {
			System.out.println("id: " + sortedWorker[i].getId());
		}

	}

}
