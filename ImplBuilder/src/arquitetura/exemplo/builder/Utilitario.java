package arquitetura.exemplo.builder;

public class Utilitario extends Carro {

	public Utilitario(String motor, String tracao, int portas, String rodas) {
		super(motor, tracao, portas, rodas);
	}

	@Override
	public String toString() {
		return "Utilit�rio: " + super.toString();
	}
}