package cs176;

public class Car {

	private int fuel_efficiency;
	private double gas;
	
	public Car(int fuel_efficiency) {
		this.fuel_efficiency = fuel_efficiency;
		this.gas = 0;
	}
	public int getFuel_efficiency() {
		return fuel_efficiency;
	}
	public double getGas() {
		return gas;
	}
	public void addGas(double gallons) {
		gas += gallons;
	}
	public void drive(double miles) {
		double gasRequired = miles / fuel_efficiency;
		if (gas >= gasRequired) {
			gas -= gasRequired;
		} else {
			System.out.println("Not enough gas!");
		}
	
}
	
{
	
}
public double getGasInTank() {
	// TODO Auto-generated method stub
	return gas;
}

}