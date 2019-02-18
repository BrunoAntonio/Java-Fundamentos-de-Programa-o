package oo.heranca;

public class TestDrive {
	
	public static void main(String[] args) {
			
		Carro civic = new Civic();
		civic.acelerar();
		System.out.println(civic.getVelocidadeActual());
		
		Carro ferrari = new Ferrari();
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidadeActual());
	}

}
