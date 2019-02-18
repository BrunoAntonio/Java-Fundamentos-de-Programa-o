package oo.heranca;

public class Carro {
	
	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidadeActual;
	
	public final void maisVelocidade(int velocidade) {
		if(velocidadeActual+velocidade > VELOCIDADE_MAXIMA) {
			velocidadeActual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeActual +=velocidade;
		}
	}
	
	public final void menosVelocidade(int velocidade){
		if(velocidadeActual-velocidade < 0) {
			velocidadeActual = 0;
		}else {
			velocidadeActual -= velocidade;
		}
	}
	
	public void acelerar() {
		maisVelocidade(5);
	}
	
	public void travar() {
		menosVelocidade(5);
	}
	
	public int getVelocidadeActual() {
		return velocidadeActual;
	}
	

}
