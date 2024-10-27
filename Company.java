package entities;

public class Company extends Person {

	protected Integer workers;
	
	
	public Integer getWorkers() {
		return workers;
	}



	public void setWorkers(Integer workers) {
		this.workers = workers;
	}

	public Company() {
		super();
	}



	public Company(String name, Double anualIncome, Integer workers) {
		super(name, anualIncome);
		this.workers = workers;
	}



	@Override
	public double tax() {
		if (workers > 10 ) {
		double tax = anualIncome * 0.14;
		return tax;
		}
		else {
			double tax = anualIncome * 0.16;
			return tax;
		}
	}

	
}
