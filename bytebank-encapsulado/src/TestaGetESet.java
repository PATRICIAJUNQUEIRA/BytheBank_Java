
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);   
		
		System.out.println(conta.getTitular().getNome());
		
		//Alterar a profissão
		conta.getTitular().setProfissao("Programador");
		// Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}

