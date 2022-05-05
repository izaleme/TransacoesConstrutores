
public class Teste {

	// o main geralmente fica na classe Teste
	public static void main(String[] args) {
		ControleTransacoes c = new ControleTransacoes();
		Transacao t = new Transacao(100, "saque");	//referencia ao objeto Transacao
		c.addTransacao(t);
		
		//System.out.println("teste");
	}
}
