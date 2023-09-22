package empresa;

public class Avaliacao {
	double nota1,nota2,nota3;
	
	public Avaliacao(){};
	public Avaliacao(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}


	public double mediaAritmetica() {
		 return (nota1+nota2+nota3)/3;
	}
	public double mediaPonderada() {
		 return (nota1*2+nota2*3+nota3*4)/9; //Pesos = Multiplica-se a nota pelo peso respectivo e soma com as outras notas e dividindo tudo pela soma total dos pesos.
	}
}
