package parte3;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente=new Gerente();
		//ramon.setSalario(5000);
		
		//Funcionario gerente =new Funcionario();
		gerente.setSalario(5000);
		gerente.setTipo(1);
		gerente.setClave("ADDERLIS");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarseccion("ADDERLIS"));
	}
	
	

}
