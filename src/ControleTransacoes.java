import java.util.ArrayList;

public class ControleTransacoes {

	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
	
	public void addTransacao(Transacao tran) {
		transacoes.add(tran);
	}
	
	public double saldo() {
		double valor = 0.0;
		for(int i = 0; i < transacoes.size(); i++) {
			Transacao t = (Transacao)transacoes.get(i);
			valor = valor + t.valor;
		}
		return valor;
	}
}
