package it.ariadne.object;

public class Car extends Vehicle {
	public Car(String targa) {
		super(targa);
		// TODO Auto-generated constructor stub
	}

	private boolean decappottabile;

	public boolean isDecappottabile() {
		return decappottabile;
	}

	public void setDecappottabile(boolean decappottabile) {
		this.decappottabile = decappottabile;
	}
	

}
