package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data nascimento = new Data();
		//nascimento.dia = 17;
		//nascimento.mes = 11 ;
		//nascimento.ano = 1988;
		
		Data casamento = new Data(10,10,2020);
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
		
		
	}

}
