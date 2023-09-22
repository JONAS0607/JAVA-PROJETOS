package testes;

public class Papel {
	private String corFundo;
	private boolean estado=false;
	
		
	
	
	public Papel(String corFundo) {		
		this.corFundo = corFundo;		
	}

	public String getCorFundo() {
		return this.corFundo; 
	}

	protected boolean escrito(boolean estado) {
		return this.estado = estado;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
}
