import java.util.Date;

public class Transacao {

	// Atributos
	double valor;
	Date data = new Date();
	String tipo;
	String referencia;
	
	// Diferen�a entre construtor e m�todo: Construtor n�o retorna nada
	// Construtor:
	
	Transacao(double valor, String tipo){
		this.valor = valor;
		this.tipo = tipo;
	}
}
