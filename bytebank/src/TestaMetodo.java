public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaPatrica = new Conta();
		contaDaPatrica.deposita(1000);
		
		if(contaDaPatrica.transfere(300, contaDoPaulo)) {
			System.out.println("Tranferência feita com sucesso!!");
		}else {
			System.out.println("saldo insuficiente para tranferência!");
		}
		System.out.println(contaDaPatrica.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
