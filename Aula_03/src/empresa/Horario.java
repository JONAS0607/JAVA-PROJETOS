package empresa;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	public int getHora() {return hora;}
	public int getMinuto() {return minuto;}
	public int getSegundo() {return segundo;}

	public void setHora(int hora) {
		if(hora<=0 && hora<=23) {
			this.hora = hora;
		}
		else {
			System.out.println("Horario invalido!");
		}		
		}
	public void setMinuto(int minuto) {this.minuto = minuto;}
	public void setSegundo(int segundo) {this.segundo = segundo;}
	
	
	
	
}
