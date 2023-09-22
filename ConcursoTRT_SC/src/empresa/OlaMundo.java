package empresa;

public class OlaMundo {
	//constante em Java é criada com a palavra (final)
	private static final int _Y=5;
	
	static private int x;
	//private int x = 10;
	public static void main(String[] args) {
		System.out.println(x); // para poder chamar uma variável fora instanciada fora do método da classe temos de inicializa-la com o modificador de acesso static
	//System.out.println(new OlaMundo().x);// instanciando uma classe para poder chamar uma variável 
	//_Y=10;//constantes não podem ser modificadas
	System.out.println(_Y);
	}

}
