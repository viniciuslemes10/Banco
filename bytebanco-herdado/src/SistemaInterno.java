
public  class SistemaInterno  {
	private int senha = 2222;
	
	public void autentica(Autentica A) {
		
		boolean autenticou = A.autentica(this.senha);
		 if(autenticou) {
			 System.out.println("Senha v�lida! ");
		 } else {
			 System.out.println("Senha invalida! ");
		 }
	}

}
