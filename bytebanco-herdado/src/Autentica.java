//Contrato Autentica
  //Quem assinar esse contrato, precisa implementar
   	//metodo setSenha
	//metodo autentica
public abstract interface Autentica {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
