package parte3;

public class Gerente extends Funcionario {
	
	private String clave;

	public boolean iniciarseccion(String clave) {
		return this.clave == clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	} 
	
	
	
	
	
	


}