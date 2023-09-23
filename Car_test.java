package cs176;

public class Car_test {

	public static void main(String[] args) {
		Car nissan = new Car(25);
		nissan.addGas(20);
		nissan.drive(100);
		double gasLeft = nissan.getGasInTank();
		System.out.println("The gas left is" + gasLeft);
		


	}
	

}
