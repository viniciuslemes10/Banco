//A classe abstract não pode ser intanciada como objeto

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//O metodo abstract faz com que os filhos calculem o resultado
	
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
