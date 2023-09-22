package empresa;

public class Euro extends Moeda {
	double euroConvertidoPraReal;

	public Euro(String tipoMoeda, double valor) {
		super(tipoMoeda, valor);
	}

	@Override
	public void info() {
		System.out.println("Info de Euro");
		super.info();
	}

	@Override
	public double converter(Moeda moeda) {
		euroConvertidoPraReal = moeda.valor * 5.40;// convertendo para real
		return euroConvertidoPraReal;
	}
}
