package empresa;

public abstract class Moeda {
	double valor;
	String tipoMoeda;

	public Moeda() {
	};

	public Moeda(String tipoMoeda, double valor) {
		super();
		this.valor = valor;
		this.tipoMoeda = tipoMoeda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.println("Info Moeda");
	};

	public double converter(Moeda moeda) {
		return 0;
	};

}
