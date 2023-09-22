package empresa;

public class Nota {
	private double nota1,nota2;
	private int faltas;
	
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public Nota() {};
	public Nota(double nota1, double nota2, int faltas) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.faltas = faltas;
	}
	private boolean verifica(double nota) {
		if(nota < 0||nota >10) {
			System.out.println("Nota não pode ser menor que zero ou maior que 10!");
			return false;
		}
		return true;
	}
	
	
	public double getNota1() {return nota1;}
	public double getNota2() {return nota2;}
	public void setNota1(double nota1) {verifica(nota1);this.nota1 = nota1;}
	public void setNota2(double nota2) {verifica(nota2);this.nota2 = nota2;}
	
	public void resultado() {
		double media = (getNota1()+getNota2())/2;		
	if(verifica(media)) {
		if(getFaltas()>5) { System.out.println("REPROVADO POR FALTAS!"); return;}
		
		if(media>=7.0) {System.out.println("Aluno Aprovado com media: "+media);}
		else if (media>=5) {System.out.println("Aluno em recuperação com média: "+media+" faltando "+(7.0-media)+" para ser aprovado!");}
		else {	System.out.println("Aluno não atingiu a média e está reprovado! media"+media);}
		
	 } 
	}
}
