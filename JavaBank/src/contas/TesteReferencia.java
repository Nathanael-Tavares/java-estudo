package contas;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		
		primeiraconta.saldo = 300;
		
		System.out.println("o saldo da primeira conta é " + primeiraconta.saldo);
		
		Conta segundaconta = new Conta();
		
		System.out.println(segundaconta.saldo);
		
		segundaconta.saldo += 100;
		
		System.out.println(segundaconta.saldo);
		
		System.out.println(primeiraconta.saldo);
		
		if (primeiraconta == segundaconta) {
			
			System.out.println("são a mesma conta!");
			
		} else {
			
			System.out.println("não são a mesma conta!");
		}
	}
}
