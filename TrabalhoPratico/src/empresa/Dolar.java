package empresa;

public class Dolar extends Moeda {
	double dolarConvertido;

	public Dolar(String tipoMoeda, double valor) {
		super(tipoMoeda, valor);

	}

	@Override
	public void info() {
		super.info();
		System.out.println("Info de Dolar");
	}

	@Override
	public double converter(Moeda moeda) {
		dolarConvertido = moeda.valor * 4.97; // convertendo para real
		return dolarConvertido;
	}
}
