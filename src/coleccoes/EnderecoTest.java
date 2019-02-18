package coleccoes;

public class EnderecoTest {
	
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua 1", 1, "porta 25");
		Endereco endereco2 = new Endereco("Rua 1", 1, "porta 25");
		
		System.out.println(endereco1 == endereco2);
		System.out.println(endereco1.equals(endereco2));
		
		
	}

}
