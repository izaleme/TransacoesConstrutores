import java.util.Date;

public class Transacao {

	// Atributos
	double valor;
	Date data = new Date();
	String tipo;
	String referencia;
	
	// Diferença entre construtor e método: Construtor não retorna nada
	// Construtor:
	
	Transacao(double valor, String tipo){
		this.valor = valor;
		this.tipo = tipo;
	}
}
