package empresa;

import java.util.HashMap;

public class Mapa {
 public static void main(String[] args) {
	 HashMap<String, String> capitais = new HashMap<String, String>();
	 
	 capitais.put("Brasil", "Brasília");
	 capitais.put("Argentina", "Buenos Aires");
	 capitais.put("Paraguai", "Assunção");
	 capitais.put("Uruguai", "Montevidéu");
	 
	 System.out.println(capitais.get("Brasil"));
	 System.out.println(capitais);
 }
}
