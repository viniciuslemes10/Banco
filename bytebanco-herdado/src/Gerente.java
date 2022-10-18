// Gerente herda da class Funcionario
public class Gerente extends Funcionario implements Autentica {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Está é a Bonificacao do Gerente");
		return super.getSalario();
	}
}
