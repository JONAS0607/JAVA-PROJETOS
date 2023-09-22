package empresa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HorasDatas {

	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println(dataHoje);
		//criando as variáveis
		int mes = dataHoje.getMonthValue();
		int day = dataHoje.getDayOfMonth();
		int ano = dataHoje.getYear();
		
	
		System.out.println(day+"/"+mes+"/"+ano);
		
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = horaAtual.format(hora);
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");//usando formatador
		System.out.println(dataHoje.format(formatador)+" - "+ horaFormatada);
		
		
		

	}

}
