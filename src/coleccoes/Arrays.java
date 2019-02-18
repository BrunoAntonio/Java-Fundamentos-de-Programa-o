package coleccoes;

public class Arrays {

	public static void main(String[] args) {

		double[] notasPedro = { 7.0, 6.0, 5.0, 4.0, 8.0};

		double[] notasJoao = new double[5];
		notasJoao[0] = 7.0;
		notasJoao[1] = 6.0;
		notasJoao[2] = 5.0;
		notasJoao[3] = 4.0;
		notasJoao[4] = 8.0;
		
		double totalPedro = 0;
		for (double nota: notasPedro) {
			totalPedro += nota;
		}
	
		/*
		for (int i = 0; i < notasPedro.length; i++) {
			totalPedro += notasPedro[i];
		}
		*/
		 	
		double totalJoao = 0;
		for (double nota : notasJoao) {
			totalJoao += nota;
		}
		
		/*
		for (int i = 0; i < notasJoao.length; i++) {
			totalJoao += notasJoao[i];
		}
		*/
		
		System.out.println("Média: "+ totalPedro/notasPedro.length);
		System.out.println("Média: "+ totalJoao/notasJoao.length);

	}
}
