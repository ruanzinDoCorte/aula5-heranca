package entidade;


public class Conta {
	
	    private String nome;
		
		private int numero;
		
		private double saldo;
		
		
		
		public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		}
		
		public void sacar(double saque) {
			saldo = saldo - saque;
		}
		public void depositar(double deposito) {
			saldo = saldo + deposito;
			
		}
		
		public String mostrar() {
			return "O nome é " + nome + "O saldo é " + saldo;
		

}
		
		
}
