package empresa;

public class Real extends Moeda {
	double moedaReal;

	public Real(String tipoMoeda, double valor) {
		super(tipoMoeda, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println("Info de Real");
		super.info();
	}

	@Override
	public double converter(Moeda moeda) {
		moedaReal = moeda.valor*1;
		return moedaReal;
	}
}
