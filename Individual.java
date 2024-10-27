package entities;

public class Individual extends Person {

	protected Double healthexp;
	

	public Double getHealthexp() {
		return healthexp;
	}

	public void setHealthexp(Double healthexp) {
		this.healthexp = healthexp;
	}
	public Individual() {
		super();
	}

	

	public Individual(String name, Double anualIncome, Double healthexp) {
		super(name, anualIncome);
		this.healthexp = healthexp;
	}

	@Override
	public double tax() {
		if (anualIncome < 20000) {
		double tax = anualIncome * 0.15;
		return tax - (healthexp * 0.50);
		}
		else {
			double tax = anualIncome * 0.25;
			return tax - (healthexp * 0.50);
		}
		
	}

	
	
}
