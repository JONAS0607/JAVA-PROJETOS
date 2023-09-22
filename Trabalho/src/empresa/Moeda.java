package empresa;

public class Moeda {
    private String tipo;
    private double valor;

    public Moeda(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
